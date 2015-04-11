package chinese_remainder;

//import statements
import java.util.ArrayList; 
import java.util.List; 

/**
 * @author Pranav Krishnamurthy
 * @version 1.0
 * @since 6th April 2015
 */
public class PrimeFactors 
{
    public static List<Integer> factors; 
    
    public static List<Integer> primeFactors(int number)
    {
        // Declaring a local variable
        int n = number;
        
        // Creating a List of Integers here, called factors
        factors = new ArrayList<Integer>(); 
        
        // Starting from 2 because we know for a fact that 2 is already a prime number
        for (int i = 2; i <= n; i++)
        {
            while (n % i == 0)
            {
                factors.add(i);
                
                // Divides then assigns
                n /= i; 
            }
        }
        
        if (n > 1)
        {
            factors.add(n); 
        }
        
        // Returning the list
        return factors; 
    }
}