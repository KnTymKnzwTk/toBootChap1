package com.example.prep.service.login;

import com.example.prep.entity.User;
import com.example.prep.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    public String getHello() {
        return "hello";
    }

    public List<User> getUserList() {
         List<User> userList = userRepository.findAll();
        return userList;
    }
}
