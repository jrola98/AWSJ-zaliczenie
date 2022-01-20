package com.example.demo.user;

import com.example.demo.user.model.User;
import com.example.demo.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = GET)
    public List<User> getUsers() {
        log.info("Return all Users.");
        return userRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = GET)
    public User getUser(@PathVariable("id") long id) {
        log.info("Get User with id: {}", id);
        return userRepository.getById(id);
    }

}
