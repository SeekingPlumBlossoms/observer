package com.gy.yb.example;

import com.gy.yb.example.WeatherSubject;

public interface Observer {

    public void update(WeatherSubject weatherSubject);

    public void setObservserName();

    public String getObserverName();
}
