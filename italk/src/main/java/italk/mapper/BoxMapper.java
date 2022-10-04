package italk.mapper;

import italk.dto.BoxDto;
import italk.entity.Box;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, uses = {UserMapper.class, MessageMapper.class})
public interface BoxMapper {

  Box map(BoxDto dto);

  BoxDto map(Box entity);

  List<BoxDto> mapToDtos(List<Box> entities);

  void map(BoxDto dto, @MappingTarget Box entity);
}
