package com.blogofJanhavi.SpringBootBackendRestService.controller;

import com.blogofJanhavi.SpringBootBackendRestService.model.User;
import com.blogofJanhavi.SpringBootBackendRestService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserbyId(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        userService.createUser(user);
        return user;
    }

    @PutMapping("/user")
    public User updateUserById(@RequestBody User user){
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserbyId(@PathVariable Long id){
        User user1=userService.deleteUser(id);
        if(user1==null)
            System.out.println("Unable to delete");
        else
            System.out.println("Deleted");
    }
}
