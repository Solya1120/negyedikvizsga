package com.example.demo.Controller;

import com.example.demo.Modells.User;
import com.example.demo.Services.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

@RestController
public class UserController {
    public final UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping(value = "/users")
    public User create(User user){
        return userService.create(user);
    }

    @DeleteMapping(value = "/users/{id}")
    public void delete(@PathVariable("id") Integer id){
        userService.delete(id);
        System.out.println("Sikeres törlés");
    }

    @PostMapping(value = "/users/update")
    public User update(User user) {
        return userService.update(user);
    }


}
