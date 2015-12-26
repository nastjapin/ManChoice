package com.company;

public class BoxDemo {

    public static void main(String[] args) {
	// write your code here
      double vol;
        Box box1= new Box(10,15,3);

        Box bох2 = new Box(1,5,10);


        vol= box1.volume();
       System.out.println("Объем равен " + vol);
        vol= bох2.volume();
        System.out.println("Объем равен " + vol);

    }
}
