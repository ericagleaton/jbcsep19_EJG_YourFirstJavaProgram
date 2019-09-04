
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Formatter;
import java.util.Scanner; // Import the Scanner class

import static javafx.scene.input.KeyCode.I;

public class HelloWorld {
        public static void main(String[] args) {
            //String userName;
            //EricauserName = "Erica";
            LocalDateTime myDateObj = LocalDateTime.now();

            //  System.out.println("Before formatting: " + myDateObj);
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate);
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("What is your name?" );
            String userName = myObj.nextLine();  // Read user input
            System.out.println("Username is: " + userName);  // Output user input

            System.out.println("Hello, World!");
            System.out.println("Today is " + formattedDate + " . I am alive!");

            System.out.println("My name is " + userName ); // Output user input

        }
}


