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
    private Integer numberToSum;
    private Integer num;

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
        for (num = 1; num <= numberToSum; num++) {
            sum += num;
            
        } 
        
        System.out.println(sum);

        return sum;
    }

}
