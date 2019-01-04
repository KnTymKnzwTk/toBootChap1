package com.example.prep.service.home;

import com.example.prep.controller.home.HomeForm;
import org.springframework.stereotype.Service;

@Service
public interface HomeService {
    HomeForm getDefaultValue();
}
