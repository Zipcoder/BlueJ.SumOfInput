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
        // initialise instance variables
        sum = 0 ;
    }
    
    public Integer oneToNumber(int numberToSum){
        
        for (int i = 1; i <= numberToSum; i++){
            sum += i;
            
        } 
        int x = sum;
        sum = 0;
        return x;
    }

}
