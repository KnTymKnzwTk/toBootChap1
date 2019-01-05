package com.example.prep.service.login;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LoginService {

    String getHello();

    List getUserList();
}
