package com.example.prep.controller.rest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @ModelAttribute
    public RestForm restForm() {
        return new RestForm();
    }

    @GetMapping("rest")
    public String rest(Model model) {
        model.addAttribute("form", restForm());
        return "true";
    }
}
