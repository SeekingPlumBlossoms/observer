package com.gy.yb;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {

    private List<Observer> observers=new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void  detach(Observer observer){
        observers.remove(observer);
    }

    protected void notifyObservers(){
        observers.forEach((observer -> observer.update(this)));
    }
}
