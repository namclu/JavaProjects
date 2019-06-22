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
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first and last name
    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email() = " + this.firstName + " " + this.lastName);

        // Call method asking for department - return the department
        this.department = setDepartment();
        System.out.println("Dept = " + this.department);
    }

    // Ask for department
    private String setDepartment() {
        System.out.println("== Department codes == \n1 for Sales \n2 for Dev \n3 for Acct \n0 for none \nEnter a department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

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

    // Change password

    // Set mailbox capacity

    // Set alternate email
}
