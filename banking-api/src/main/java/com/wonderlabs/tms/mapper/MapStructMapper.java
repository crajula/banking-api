package com.wonderlabs.tms.mapper;

import com.wonderlabs.tms.dto.*;
import com.wonderlabs.tms.entity.*;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {

    UserDTO userEntityToUserDto(  UserEntity userEntity );

    UserEntity userDtoToUserEntity( UserDTO userDTO );

}