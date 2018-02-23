package com.example.demo.service;


import com.example.demo.model.Screen;

import java.util.List;

public interface ScreenService {

    List<Screen> getAllScreens();
    Screen getScreenById(Integer id);
    Screen updateScreenById(Screen screen);

}
