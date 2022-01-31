package com.app.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.micro.modelo.User;
import com.app.micro.service.UserService;

import java.util.List;


@RestController
public class UserController {

	@Autowired
	UserService userS ;
	
	
	
	@RequestMapping(value = "/getDatos", method = RequestMethod.GET)
    public List <User> getAllUsers() {
        return userS.getAllUsers();
    }
	
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody()
    
    public User addNewUser(@RequestBody User user) {
        return this.userS.addUser(user);
    }
}
