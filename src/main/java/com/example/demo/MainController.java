package com.example.demo;

import com.example.demo.model.Screen;
import com.example.demo.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/screen")
public class MainController {

    @Autowired
    private ScreenService screenService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Screen> allScreens(){
        return screenService.getAllScreens();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Screen getScreen(@PathVariable("id") Integer id){
        return screenService.getScreenById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody Screen updateScreen(@RequestBody Screen screen) {
        return screenService.updateScreenById(screen);
    }


}
