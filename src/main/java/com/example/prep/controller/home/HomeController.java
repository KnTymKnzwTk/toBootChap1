package com.example.prep.controller.home;

import com.example.prep.service.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    @ModelAttribute("form")
    public HomeForm form() {
        return new HomeForm();
    }

    @Autowired
    HomeService homeService;

    @GetMapping("home")
    public String index(Model model) {
        HomeForm form = homeService.getDefaultValue();
        model.addAttribute("form", form);
        return "home";
    }
}
