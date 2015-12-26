package com.company;

/**
 * Created by Анастасия on 13.12.2015.
 */
public class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        //System.out.println("Constr Box");
        width=w;
        height=h;
        depth =d;
    }
double volume(){
    //System.out.print("Volume is");
    //System.out.println(width*height*depth);
    return width*height*depth;
}
}
