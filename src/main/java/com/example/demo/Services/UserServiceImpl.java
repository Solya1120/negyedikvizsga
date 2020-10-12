package com.example.demo.Services;

import com.example.demo.Modells.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User create(User user){
        userRepository.save(user);
        return user;
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(User user) {
        userRepository.save(user);
        return user;
    }
}
