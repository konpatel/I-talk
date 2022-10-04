package italk.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BoxDto {

  private String id;
  private String title;
  private List<MessageDto> messageList;
}
