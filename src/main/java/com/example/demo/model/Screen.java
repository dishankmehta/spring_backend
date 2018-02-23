package com.example.demo.model;

public class Screen {

    private Integer id;
    private String screenTitle;
    private String screenData;


    public Screen(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScreenTitle() {
        return screenTitle;
    }

    public void setScreenTitle(String screenTitle) {
        this.screenTitle = screenTitle;
    }

    public String getScreenData() {
        return screenData;
    }

    public void setScreenData(String screenData) {
        this.screenData = screenData;
    }
}
