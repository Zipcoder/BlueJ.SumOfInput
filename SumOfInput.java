/**
 * class SumOfInput takes a number and the sum is all the numbers before it
 * added together. EX: for 5 it would be, 1 + 2 + 3 + 4 + 5 = 15.
 * 
 * @author (Sandy Pham)
 * @version (10/17/19)
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
        sum = 0;
        for (int x = 0; x <= numberToSum; x++)
            sum = sum + x;
        return sum;
    }
}

