package ru.sbt.education;

import java.text.ParseException;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        IHelloGiver helloGiver = HelloGiverFactory.createHelloGiverInstace(SUPPORTED_LANGUAGES.ENG);
        System.out.println(helloGiver.sayHello());
    }

}