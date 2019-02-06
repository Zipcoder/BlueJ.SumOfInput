import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number");
        int n = scan.nextInt();
        
        
        for(int i = 1; i <= n; i++){
        sum+= i;
    }
        System.out.println("The sum is " + sum);
    }
}
