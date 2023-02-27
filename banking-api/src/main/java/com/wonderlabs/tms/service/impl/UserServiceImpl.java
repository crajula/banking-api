package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.UserDTO;
import com.wonderlabs.tms.entity.UserEntity;
import com.wonderlabs.tms.mapper.MapStructMapper;
import com.wonderlabs.tms.repository.UserRepository;
import com.wonderlabs.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(UserDTO userDTO) {
       // UserEntity userEntity = userEntityToUserDto(userDTO);
       // userRepository.save(userEntity);
    }

    @Override
    public UserDTO findUserById(String userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(String id, UserDTO userDTO) {
           Optional<UserEntity> userEntity =  userRepository.findById(Long.valueOf(id));
           UserEntity userEntity1 = userEntity.get();
           userEntity1.setUserId(userDTO.getUserId());// Add all other properties
           userRepository.save(userEntity1);
    }


    @Override
    public void deleteUser(String id) {
        userRepository.deleteById(Long.valueOf(id));
    }
}
