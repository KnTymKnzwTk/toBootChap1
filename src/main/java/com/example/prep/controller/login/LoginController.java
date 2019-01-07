package com.example.prep.controller.login;

import com.example.prep.entity.User;
import com.example.prep.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/login")
public class LoginController {
    @ModelAttribute("form")
    public LoginForm getForm() {
        return new LoginForm();
    }

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(Model model) {
        List<User> userList = loginService.getUserList();
        model.addAttribute("userList", userList);
        return "login";
    }

    @GetMapping("/check")
    public String check(Model model) {
        model.addAttribute("form", getForm());
        return "login";
    }
}
