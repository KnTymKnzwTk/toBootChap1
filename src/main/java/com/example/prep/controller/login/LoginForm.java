package com.example.prep.controller.login;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginForm implements Serializable {

    private static final long serialVersionUID = 2L;

    private String mailAddress;

    private String password;
}
