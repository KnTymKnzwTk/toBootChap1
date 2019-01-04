package com.example.prep.controller.home;

import com.example.prep.service.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute("form")
    public HomeForm form() {
        return new HomeForm();
    }

    @Autowired
    HomeService homeService;

    @GetMapping("home")
    public ModelAndView index(ModelAndView mav) {
        mav.addObject("form", homeService.getDefaultValue());
        mav.setViewName("home");
        return mav;
    }
}
