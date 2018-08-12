
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.parseInt(reader.nextLine());
        int cycle = 0;
        int sum = 0;
                
        while (cycle <= number) {
            sum += (int)Math.pow(2, cycle);
            cycle ++;
        }
        System.out.println("The result is: " +sum);

    }
}
