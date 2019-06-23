package emailapp;

import java.util.Scanner;

/*
 * 1) Generate an email with the following syntax: firstname.lastname@department.company.com
 * 2) Determine the department (sales, development, accounting), if none leave blank
 * 3) Generate a random String for a password
 * 4) Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 * 5) Have get methods to display the name, email, and mailbox capacity
 * */
class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int defaultLength = 11;
    private int mailboxCapacity = 100;
    private String alternateEmail;

    // Constructor to receive first and last name
    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email() = " + this.firstName + " " + this.lastName);

        // Call method asking for department - return the department
        this.department = setDepartment();
        System.out.println("Dept = " + this.department);

        // Call method that returns random password
        this.password = randomPassword(defaultLength);
        System.out.println("Password = " + this.password);

        // Generate an email: firstname.lastname@department.company.com
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
        System.out.println("Email = " + email);
    }

    // Ask for department
    private String setDepartment() {
        System.out.print("== Department codes == \n1 for Sales \n2 for Dev \n3 for Acct \n0 for none \nEnter a department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        System.out.println();

        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Dev";
        } else if (deptChoice == 3) {
            return "Acct";
        } else {
            return "none";
        }
    }

    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789)!@#$%^&*(";
        char [] password = new char[length];

        for (int i = 0; i < length; i++) {
            int randomInt = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomInt);
        }
        return new String(password);
    }

    /* Setters */
    // Change password
    void setPassword(String password) {
        this.password = password;
    }

    // Set mailbox capacity
    void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // Set alternate email
    void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    /* Getters */
    String getPassword() {
        return password;
    }

    int getMailboxCapacity() {
        return mailboxCapacity;
    }

    String getAlternateEmail() {
        return alternateEmail;
    }
}
