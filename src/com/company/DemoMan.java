package com.company;

/**
 * Created by Анастасия on 13.12.2015.
 */
public class DemoMan {
    public static void main(String[] args) {

   Man First=new Man(1.65, 65, 19);
        First.name("Vasya");
     int ages=First.years();
        First.body();
        First.cinema();
        First.restaurant("McDonalds");

        Man Second =new Man(1.95, 100, 26);
        Second.name("Fedya");
        ages = Second.years();
        Second.cinema();
        Second.restaurant("Paris");

        Man Third=new Man();
        Third.name("BezKonstuctora");
        ages = Third.years();
        Third.body();
        Third.cinema();
        Third.restaurant("Mafia");






    }




}
