package emailapp;

/*
* Project 1
* Email Application
* Scenario: You are an IT Support Administrator Specialist and are charged
* with the task of creating email accounts for new hires.
* */

public class EmailApp {

    public static void main(String[] args) {
        Email email01 = new Email("John", "Smith");

        email01.setAlternateEmail("john.smith@gmail.com");
        System.out.println("Alternate email = " + email01.getAlternateEmail());

        email01.setMailboxCapacity(20);
        System.out.println("Email capacity = " + email01.getMailboxCapacity());

        email01.setPassword("abc123");
        System.out.println("New password = " + email01.getPassword());
    }
}
