package com.example.prep.service.home;

import com.example.prep.controller.home.HomeForm;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{
    public HomeForm getDefaultValue() {
        HomeForm form = new HomeForm();
        form.setApple("りんご");
        form.setOrange("オレンジ");
        form.setStrawberry("いちご");

        return form;
    };
}
