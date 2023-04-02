package com.knoldus;

public class Main{
public static void main(String args[]){
    //Updating the Main class to create a Person object and use the new method
    // to check if the person is an adult.
    Person person = new Person("Nadra", 22);
    if(person.isAdult())   System.out.println(person.getName() + " is an adult");
    else   System.out.println(person.getName() + " is not an adult");

    System.out.println("Hello, world!");
}
}
