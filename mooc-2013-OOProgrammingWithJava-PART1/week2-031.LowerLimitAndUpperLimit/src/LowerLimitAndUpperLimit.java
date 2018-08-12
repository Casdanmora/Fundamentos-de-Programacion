
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int number2 = Integer.parseInt(reader.nextLine());
        while (number1 <= number2) {
            System.out.println(number1);
            number1++;

        }
    }
}
