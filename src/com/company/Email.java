package com.company;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String email;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "megacompany.com";

   // const 2 recive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created : " + this.firstName + " " + this.lastName);

        // call the method
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call the method that returns pass
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);

        // generate mail
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Created mail is : " + email);

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

    private String randomPassword(int lenght) {
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWYXZabcdefghijklmnopqrstuvwyz0123456789!@#$%&";
        char[] password = new char[lenght];
        for (int i=0; i<lenght;i++) {
            int rand = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the capacity for mailbox
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // set the alternative mail
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                "\nCompany email : " + email +
                "\nMail box capacity: " + mailBoxCapacity + "Mb";

    }

}
