package com.example.prep.controller.login;

import com.example.prep.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {
    @ModelAttribute("form")
    public LoginForm getForm() {
        return new LoginForm();
    }

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(Model model) {
        LoginForm lf = new LoginForm();
        lf.setMailAddress(loginService.getHello());

        model.addAttribute("form", lf);
        return "login";
    }

    @GetMapping("/check")
    public String check(Model model) {
        model.addAttribute("form", getForm());
        return "login";
    }
}
