package org.am.springbootrestjpa.controller;

import org.am.springbootrestjpa.entity.User;
import org.am.springbootrestjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * The UserController class.
 *
 * @author Alexander Maximenya
 * @version 2017-12-13
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("default")
    public int createDefaultUsers() {
        return userService.save(Arrays.asList(
                new User(1, "user1", "firstName1", "lastName1", "notes1"),
                new User(2, "user2", "firstName2", "lastName2", "notes2")
        ));
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @GetMapping
    public List<User> find(UserRequest userRequest) {
        if (userRequest.getUserName() != null && userRequest.getFirstName() != null) {
            return userService.findByUserNameFirstName(userRequest.getUserName(), userRequest.getFirstName());
        } else if (userRequest.getUserName() != null) {
            return userService.findByUserName(userRequest.getUserName());
        } else if (userRequest.getFirstName() != null) {
            return userService.findByFirstName(userRequest.getFirstName());
        }
        return userService.findAll();
    }
}
