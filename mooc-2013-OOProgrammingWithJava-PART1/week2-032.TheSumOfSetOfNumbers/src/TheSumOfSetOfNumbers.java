
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what?");
        int number = Integer.parseInt(reader.nextLine());
        int cycle = 1;
        int sum = 0;
        
        while (cycle <= number) {
            sum = sum + cycle;
            cycle ++;
        }
        System.out.println("Sum is: " +sum);
    }
}
