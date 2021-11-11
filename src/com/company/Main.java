package com.company;

import java.util.Scanner;

//Sebastian Boyer
//Major - IS
//sboyer1@umbc.edu
public class Main {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        Integer age;
        Double hours;
        Double payRate;
        Double grossPay;
        Double netPay;
        Boolean isFullTime;
        final Double tax = .10;

        Scanner input= new Scanner(System.in);
        System.out.print("First Name: ");
        firstName = input.next();
        System.out.print(firstName + "\n");

        System.out.print("Last Name: ");
        lastName = input.next();
        System.out.print(lastName + "\n");

        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print(age + "\n");

        System.out.print("Hours: ");
        hours = input.nextDouble();
        System.out.print(hours + "\n");

        System.out.print("Pay Rate: ");
        payRate = input.nextDouble();
        System.out.print(payRate + "\n");

        System.out.print("Do You Work Full Time(true/false): ");
        isFullTime = input.nextBoolean();
        System.out.print(isFullTime + "\n");

        System.out.print("First Name: " + firstName + "\n");
        System.out.print("Last Name: " + lastName + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Hours: " + hours + "\n");
        System.out.print("Pay Rate: " + payRate + "\n");
        System.out.print("Do You Work Full Time: " + isFullTime + "\n");

        grossPay=hours * payRate;
        netPay= grossPay - (grossPay * tax);
        System.out.print("Gross Pay: " + grossPay + "\n");
        System.out.print("Net Pay: " + netPay + "\n");

    }
}
