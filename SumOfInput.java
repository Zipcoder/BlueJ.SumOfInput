/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        int n = numberToSum;
        int sum = (n*(n+1))/2;
        return sum;
    }

}
