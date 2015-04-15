package chinese_remainder;

import java.util.*; // Adding in the import statement

/**
 * @author Pranav Krishnamurthy
 * 
 * @since 15th April 2015
 * Now will be having the ability for the main class to handle the list and converting
 * it into an array. 
 */

public class Main 
{ 
    static List<Integer> factors_MainClass; 
    /**
     * @param args the command line arguments - Which are usually 
     * none starting at the execution time. 
     */
    public static void main(String[] args) 
    {
        // Prompting for the user to enter in an integer. 
        System.out.println("Enter an integer, n."); 
        
        // Initialize the scanner
        Scanner kb = new Scanner(System.in); 
        
        // Creating the integer variable from the console input
        int n = kb.nextInt(); 
        
        // int factors_size = factors.size(); 
        
        // Adding in an input check
        if (n < 100)
        {
            // Confirming with the user. 
            System.out.println("Your value of input, n = " + n); 
        
            // Making the call here - To break the number into factors. 
            PrimeFactors.primeFactors(n); 
        }
        
        // Populating the Integer List in the Main Class file
        factors_MainClass = PrimeFactors.factors; 
        
        // Now making the method call to the be able to convert the List into an integer array. 
        int[]factors = convertIntegers(factors_MainClass);
        
        // Going to print out the array elements. 
        for (int i = 0; i < factors.length; i++)
        {
            // Printing out the array just as a reminder
            System.out.println(factors[i]); 
        }
    }
    
    public static int[] convertIntegers(List<Integer> factors_MainClass)
    {
        int[] ret = new int[factors_MainClass.size()]; 
        
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = factors_MainClass.get(i).intValue(); 
        }
        
        return ret; 
    }
}