package chinese_remainder;

import java.util.*; // Adding in the import statement

/**
 * @author Pranav Krishnamurthy
 * 
 * @since 10th April 2015
 * Going to now be optimizing this and will then be going to have either a method
 * or a class to filter out redundant elements in the array. 
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
        
        // Adding in an input check
        if (n < 100)
        {
            // Confirming with the user. 
            System.out.println("Your value of input, n = " + n); 
        
            for (Integer integer : PrimeFactors.primeFactors(n))
            {
                // Prints out the prime factors (even with redundancies)
                System.out.println(integer);                
            }
        }
    }   
}