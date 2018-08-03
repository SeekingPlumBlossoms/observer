package com.gy.yb;

public class Client {
    public static void main(String[] args ){
      //1.创建目标
        ConcreteWeatherSubject concreteWeatherSubject=new ConcreteWeatherSubject();
        //2.创建观察者
        ConcreteObserver observerGirl=new ConcreteObserver();
        observerGirl.setObserverName("女友");
        observerGirl.setRemindThing("约会");

        ConcreteObserver observerMum=new ConcreteObserver();
        observerMum.setObserverName("妈妈");
        observerMum.setRemindThing("购物");

        //3.注册观察者
        concreteWeatherSubject.attach(observerGirl);
        concreteWeatherSubject.attach(observerMum);

        //4.发布目标
        concreteWeatherSubject.setWeatherContent("明天天气晴，气温很好");

    }
}
