package com.tekparams.OOPS;

public class Address {
    //Data members or Variable or Instance variable
    String doorNo;
    String street;
    String city;
    int pin;

    //Method or action or function (like main funct) - it will come with paranthesis ()
    void printAddress(){
        //variable inside methods are call local variable //int a;
        //print door number
        System.out.println(doorNo+"\n"+street+"\n"+city+"\n"+pin);
    }
    Address(){
        doorNo = "F400";
        street = "ABC street";
        city = "Bangalore";
        pin = 66776;
    }
    public static void main(String[] args){
        // class name  Object name = new keyword contructor of class
        // new Address() is a constructor
        Address address = new Address();
        address.printAddress();
    }
}
