package oops;

import java.util.Scanner;

public class Person {
    int id;
    String name;
    int age;
    void show(){
        System.out.println("Im in show method");
    }
    public static void main(String[] args) {
        // allocate memory
        // heap memory area
        Person person; //reference variable
        person = new Person(); //creating an object of Person
        System.out.println(person.id);
        System.out.println(person.name);
        System.out.println(person.age);
        person.show();
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Name is "+name);
    }
}
