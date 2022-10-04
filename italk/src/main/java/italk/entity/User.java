package italk.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "user")
public class User {

  @Id
  @Column(name = "id", unique = true, nullable = false)
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name = "username")
  private String username;

  @Column(name = "icon")
  private String icon;

  @Column(name = "email")
  private String email;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "user_box", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "box_id"))
  private List<Box> boxList;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "user")
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<Message> messageList;
}
