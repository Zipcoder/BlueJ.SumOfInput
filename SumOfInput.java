/**
 * Write a description of class SumOfInput here.
 *
 * @author (Maanny)
 * @version (June 24 2021)
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
            int stepOne = numberToSum + 1;
            int stepTwo = stepOne * numberToSum;
            int stepThree = stepTwo / 2;
            sum = stepThree;
        
        return sum;
    } 

}
