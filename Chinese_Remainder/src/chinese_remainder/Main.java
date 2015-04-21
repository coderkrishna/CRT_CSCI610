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
        // Creating the integer variable from the console input
        int n = 21; 
        
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
        
        // Finally making the call to generate the mappings. 
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
}