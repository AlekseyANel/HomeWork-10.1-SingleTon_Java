package com.alevel;

public class SingleTon {
String name;
    private static SingleTon instance;//переменная приватная

    private SingleTon(String name) {
        this.name=name;
    }
    public static SingleTon getInstance() {//метод статический видимый
        if (instance == null) {//проверка наличия переменной в программе
            instance = new SingleTon("Alex");
        }
        return instance;//вывод переменной из этого метода
    }
}


