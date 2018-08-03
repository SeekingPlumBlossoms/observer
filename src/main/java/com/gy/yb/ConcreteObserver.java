package com.gy.yb;

public class ConcreteObserver implements Observer {

    private String observerName;

    private String weatherContent;

    private String remindThing;


    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent=((ConcreteWeatherSubject)weatherSubject).getWeatherContent();
        System.out.println(observerName+"收到了"+weatherContent+","+remindThing);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
