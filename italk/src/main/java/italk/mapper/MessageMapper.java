package italk.mapper;

import italk.dto.MessageDto;
import italk.entity.Message;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, uses = {UserMapper.class})
public interface MessageMapper {

  Message map(MessageDto dto);

  MessageDto map(Message entity);

  List<MessageDto> mapToDtos(List<Message> entities);

  void map(MessageDto dto, @MappingTarget Message entity);
}
