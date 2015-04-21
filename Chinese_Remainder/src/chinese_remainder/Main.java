package chinese_remainder;

import java.util.*; // Adding in the import statement

/**
 * @author Pranav Krishnamurthy
 * 
 * @since 20th April 2015
 * Writing the method that will be generating the mappings given the value of 
 * n that has been <i>hard-coded</i> into the program. 
 */

public class Main 
{ 
    // Creating a class variable which will be used throughout this class
    static List<Integer> factors_MainClass; 
    
    /**
     * @param args the command line arguments - Which are usually 
     * none starting at the execution time. 
     */
    public static void main(String[] args) 
    { 
        // Creating the integer variable from the console input
        int n = 21; 
        
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
        
        // Telling the printing of the factors. 
        System.out.println("Your factors for the value of n = " + n + " are:");
        
        // Going to print out the factors of the number that has been hard-coded
        for (int i = 0; i < factors.length; i++)
        {
            System.out.println(factors[i]); 
        }
        
        // Finally making the call to generate the mappings. 
        GenerateMappings(factors, n); 
    }
    
    /**
     * This method will now be tackling the conversion of a List in Java to an 
     * integer array. 
     * @param factors_MainClass This parameter is a List of type <i>Integer</i> which is a data structure
     * that is returned by the PrimeFactors.java class file. 
     * @return An integer array, int[] ret which helps in confirming that we have returned an array 
     * of integers. 
     */
    public static int[] convertIntegers(List<Integer> factors_MainClass)
    {
        // Creating the integer array. 
        int[] ret = new int[factors_MainClass.size()]; 
        
        // Looping through the integer array
        for (int i = 0; i < ret.length; i++)
        {
            // Every index of the array will be populated by the value 
            // at that same index in the list. 
            ret[i] = factors_MainClass.get(i).intValue(); 
        }
        
        // return statement to have the array for us to further manipulate and generate the mappings.
        return ret; 
    }
    
    /**
     * This method will now be generating the Chinese Remainder Tuples which will be 
     * printed out in the loop.
     * @param factors This is the integer array which was created from the Integer List before. 
     * @param n - This is a number that is fixed, and put into the computer. 
     */
    public static void GenerateMappings(int[] factors, int n)
    {
        // Just a quick little reminder to the end user
        System.out.println("Note that the equals (=) sign will denote the phrase of 'maps to' in our output of "
        + "the mappings for the Chinese Remainder Theorem for the value of n = " + n); 
        
        // Iterating over the loop of i = 0 to n-1.
        for (int t = 0; t <= n - 1; t++)
        {
            System.out.println(t + " = "+ "(" + t % factors[0] + "," + t % factors[1] + ")"); 
        }
    }
}