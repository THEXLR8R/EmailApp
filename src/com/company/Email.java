package com.company;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

   // const 2 recive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created : " + this.firstName + " " + this.lastName);

        // call the method
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    // ask for department
    private String setDepartment() {
        System.out.println("Enter your department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else  {
            return "None";
        }
    }

    // generate a random password

    // set the capacity for mailbox

    // set the alternative mail

    // change the password


}
