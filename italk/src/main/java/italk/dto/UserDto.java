package italk.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {

    private String id;
    private String username;
    private String icon;
    private String email;
    private List<MessageDto> messageList;
    private List<BoxDto> boxList;
}
