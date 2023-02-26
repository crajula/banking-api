package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.UserDTO;
import com.wonderlabs.tms.entity.UserEntity;
import com.wonderlabs.tms.mapper.MapStructMapper;
import com.wonderlabs.tms.repository.UserRepository;
import com.wonderlabs.tms.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private MapStructMapper mapstructMapper;
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository ){
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(UserDTO userDTO) {
       // UserEntity userEntity = userDtoToUserEntity(userDTO);
       // userRepository.save(userEntity);
    }

    @Override
    public User findUserById(String userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }
}
