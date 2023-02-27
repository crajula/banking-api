package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.UserDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    public void createUser(UserDTO userDTO);
    public UserDTO findUserById(String userId);
    public List<UserDTO> getAllUsers();
    public void updateUser(String id, UserDTO userDTO);
    public void deleteUser(String id);
}
