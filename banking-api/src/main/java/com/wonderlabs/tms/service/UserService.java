package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.UserDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    public void createUser(UserDTO userDTO);
    public User findUserById(String userId);
    public List<User> getAllUsers();
    public void updateUser(UserDTO userDTO);
}
