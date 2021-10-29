/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sumNum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sumNum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        
        sumNum = 0;
        
        
        for(int i = 0; i <= numberToSum; i++){
        sumNum += i;
        }
        return sumNum;
    }

}
