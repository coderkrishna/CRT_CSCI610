package chinese_remainder;

import java.util.*; // Adding in the import statement

/**
 * @author Pranav Krishnamurthy
 * @since 6th April 2015
 * This is the main (driver) class which I am using to call the Prime Factors class as well.
 */

public class Main 
{    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Prompting for the user to enter in an integer. 
        System.out.println("Enter an integer, n."); 
        
        // Initialize the scanner
        Scanner kb = new Scanner(System.in); 
        
        // Creating the integer variable from the console input
        int n = kb.nextInt(); 
        
        // Confirming with the user. 
        System.out.print("Your value of input, n = " + n); 
    }   
}