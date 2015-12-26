package com.company;

/**
 * Created by Анастасия on 13.12.2015.
 */
public class Man {
    double high;
    double weight;
    int age;
    Man(double h,double w,int a ){
        high=h;
        weight=w;
        age=a;

    }
    Man()
    {
        high=1.70;
        weight=80;
        age=21;
//Можно ли в конструктор записать метод?? НАПРИМЕР, ИМЯ
    }


    void name(String n){
            System.out.println("B: Hello, my name is "+n);
    }

    int years(){
        System.out.println("B: I am "+age+ " years old");
        return age;
    }

    void restaurant(String res){
        System.out.println("B: We can go to the "+res);
        if (res.equals("McDonalds")) {
            System.out.println("G: No");}
            else
            System.out.println("G: Ok");
        System.out.println(" ");
        }

    void cinema (){
        System.out.println("B: Lets go to the cinema");
        System.out.println("G: Good idea. Lets go.");
    }

     void body(){
        if (high>1.68 && weight>60 && weight<101)
            System.out.println("I have normal body");
        else {
            System.out.println("I have problems with body");
        }
    }
    }

