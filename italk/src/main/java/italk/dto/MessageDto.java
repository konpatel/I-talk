package italk.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class MessageDto {

    private String id;
    private String text;
    private Timestamp dateTime;
    private BoxDto box;
}
