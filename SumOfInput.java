/**
 * Write a description of class SumOfInput here.
 *
 * @author (Jorge)
 * @version (February 25, 2020)
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
        for (int i=0; i < numberToSum+1; i++) {
            sum += i;
        }
        return sum;
    }

}
