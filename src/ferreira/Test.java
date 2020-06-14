package ferreiraAssigment1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Print out a message
        System.out.print("Password Must Have At Least 8 Characters And At Least 1 Digit \n" +
                "Please Enter The Password: ");

        //Create an scan object to take input
        Scanner scanner = new Scanner(System.in);

        //Take the input with the scan object and store it
        String password = scanner.nextLine();


        //Create a new user object passing the password as parameter in the constructor
        User user = new User(password);

        //print the user which must have only the password and the rest must be null
        System.out.println(user);

        //Use the hashUserPassword to create hash and salt for this user based on its passwords
        //And handling exception
        boolean validate; //A validation variable
        do {
            validate = true; //The validation start a true
            try {
                NSALoginController.hashUserPassword(user);
            } catch (Exception e) { //if an exception is catch a new variable is prompt
                System.out.println(e + "\nPlease Provide a New Password: ");
                //Take the input with the scan object and store it
                password = scanner.nextLine(); //Get a new password
                user.setPassword(password); //set the new password to the user
                validate = false;//Validation is set to false so the look runs and test it again
            }
        } while (!validate);

        //Print the user with the new information
        System.out.println(user);

        //Prompt a password to be checked and store it into a string
        System.out.print("Enter a password to be verified: ");
        String confirmedPassword = scanner.nextLine();

        //set the user password to the new password
        user.setPassword(confirmedPassword);

        //Verify if it matches
        try {
            if (NSALoginController.verifyPassword(user)) {
                System.out.println("Your Passwords Successfully Matches!");
            } else {
                System.out.println(("Password Does Not Match!"));
            }
        } catch (Exception e) {
        }
    }
}
