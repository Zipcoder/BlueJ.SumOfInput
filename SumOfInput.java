/**
 * This class takes an interager value, then adds together all of the
 * numbers, starting from one, up until it reaches the entered value.
 * @author (Jacob Stagg)
 * @version (10-29-21)
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

    public Integer oneToNumber(Integer numberToSum)
    {
        sum = 0;
        for (int i = 1; i <= numberToSum; i++) {
            sum += i;
        }
        System.out.println(sum);

        return sum;
    }
}
