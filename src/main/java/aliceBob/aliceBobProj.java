package aliceBob;

import java.util.Scanner;

public class aliceBobProj {
    //Understand how to get input from user
    //Create conditional to check against Alice and Bob
    //Print greeting to screen if Alice or Bob are true

    //import scanner into class
    //then creating new scanner

    //wanted program to ask me for first name

    //created variable with String data type for the first name

    //assigned variable to 2 different names
    //created if statement for the greeting & naming Alice & Bob
    //created else statement for using names that aren't Alice & Bob
    //create while loop to keep going(as long as the conditions are met) until it says Alice & Bob
    //put break after the if statement to end the loop when it says Alice or Bob
    //ends the loop
    public static void main(String[] args) {
        while(true) {


            Scanner idk = new Scanner(System.in);
            System.out.println("Enter your first name: ");

            String firstName = idk.nextLine();
            if (firstName.equals("Alice") || firstName.equals("Bob")) {
                System.out.println("Hello " + firstName);
                break;
            } else {
                System.out.println("Name not Valid");
            }
        }
    }
}
