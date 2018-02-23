package com.example.demo.service;

import com.example.demo.dao.ScreenDao;
import com.example.demo.model.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreenServiceImpl implements ScreenService {

    @Autowired
    private ScreenDao screenDao;

    @Override
    public List<Screen> getAllScreens() {
        return screenDao.getAllScreens();
    }

    @Override
    public Screen getScreenById(Integer id) {
        return screenDao.getScreenById(id);
    }

    @Override
    public Screen updateScreenById(Screen screen) {
        return screenDao.updateScreenById(screen);
    }
}
