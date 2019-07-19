package com.example.demo.controller;

import com.example.demo.repository.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {
/*
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{name}")
    public @ResponseBody String addNewUser (@RequestParam String name)
    {
        User user = new User();
        user.setSzUserID(name);
        userRepository.save(user);
        return  "Saved";
    }
*/
}
