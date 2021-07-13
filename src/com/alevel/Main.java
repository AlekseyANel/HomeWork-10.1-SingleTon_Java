package com.alevel;

public class Main {

        public static void main(String[] args) {

            SingleTon s = SingleTon.getInstance();//создаем единственный-уникальный объект s
            System.out.println("New unique object has name " + s.name);//выводим поле name уникального объекта s класса SingleTon
        }
    }
