/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer answer;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        answer = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        answer = numberToSum + 1;
        return answer;
    }

}
