package italk.mapper;

import italk.dto.UserDto;
import italk.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, uses = {MessageMapper.class, BoxMapper.class})
public interface UserMapper {

  User map(UserDto dto);

  UserDto map(User entity);

  List<UserDto> mapToDtos(List<User> entities);

  void map(UserDto userDTO, @MappingTarget User entity);
}
