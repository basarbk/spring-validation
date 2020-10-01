package com.bafoly.validation.user;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/users")
  public User createUser(@Valid @RequestBody User user){
    return this.userService.save(user);
  }
  
}
