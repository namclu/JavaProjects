package emailapp;

/*
* 1) Generate an email with the following syntax: firstname.lastname@department.company.com
* 2) Determine the department (sales, development, accounting), if none leave blank
* 3) Generate a random String for a password
* 4) Have set methods to change the password, set the mailbox capacity, and define an alternate email address
* 5) Have get methods to display the name, email, and mailbox capacity
* */
public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email() = " + this.firstName + " " + this.lastName);

        // Call method asking for department - return the department
    }

    // Ask for department


    // Generate random password

    // Change password

    // Set mailbox capacity

    // Set alternate email
}
