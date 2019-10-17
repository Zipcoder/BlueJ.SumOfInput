/**
 * Write a description of class SumOfInput here.
 *
 * @author Maira Botelho
 * @version 10.16.2019
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
            
            for(int x = 0; x <= numberToSum; x++){
                sum = sum + x;
            }
            
        return sum;
    }

}
