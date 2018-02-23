package com.example.demo.dao;

import com.example.demo.model.Screen;

import java.util.List;

public interface ScreenDao {

    List<Screen> getAllScreens();
    Screen getScreenById(Integer id);
    Screen updateScreenById(Screen screen);

}
