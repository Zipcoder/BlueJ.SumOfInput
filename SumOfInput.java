/**
 * Sum of numbers
 *
 * @David Comer
 * @2/5/20
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
         
        for (int n = 1; n <= numberToSum; n++) 
        sum = n/2*(n+1); 
        return sum;
    }

}
