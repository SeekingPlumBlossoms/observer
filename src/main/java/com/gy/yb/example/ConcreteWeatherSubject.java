package com.gy.yb.example;

import com.gy.yb.example.WeatherSubject;

public class ConcreteWeatherSubject extends WeatherSubject{
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }

    @Override
    protected void notifyObservers() {
        observers.forEach((observer -> {
            if("下雨".equalsIgnoreCase(this.weatherContent)){
                if(observer.getObserverName().equalsIgnoreCase("女友")){
                    observer.update(this);
                }
                if(observer.getObserverName().equalsIgnoreCase("妈妈")){
                    observer.update(this);
                }
            }
        }));
    }
}
