/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(){
        System.out.print('\u000C');
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer positive number: ");
        try{
        int number = input.nextInt();
        int container = 0;
        //System.out.println(number);
            for(int i = 0; i <= number; i++){
                container += i;
                //System.out.println(container);
            }
            System.out.printf("\nThe sum from 0 to %d is %d.",number,container);
        }
        catch( Exception e){
            System.out.println("You didn't enter an integer positive number. \nTry again!");
        }
    }
}
