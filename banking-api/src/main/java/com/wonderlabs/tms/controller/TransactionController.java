package com.wonderlabs.tms.controller;

import com.wonderlabs.tms.dto.UserDTO;
import com.wonderlabs.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/tms")
public class TransactionController {

    @Autowired
    private UserService userService;

    @GetMapping("/transaction/{id}")
    public ResponseEntity<UserDTO> getCommentsByTutorialId(@PathVariable(value = "id") String id) {
        UserDTO userDTO = userService.findUserById(id);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @PostMapping("/transaction/create")
    public ResponseEntity createUser(@RequestBody UserDTO userDTO) {
        userService.createUser(userDTO);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @PutMapping("/transaction/update/{id}")
    public ResponseEntity updateComment(@PathVariable("id") String id, @RequestBody UserDTO userDTO) {
        userService.updateUser(id, userDTO);
        return new ResponseEntity(userDTO, HttpStatus.OK);
    }

    @DeleteMapping("/transaction/delete/{id}")
    public ResponseEntity<HttpStatus> deleteComment(@PathVariable("id") String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}