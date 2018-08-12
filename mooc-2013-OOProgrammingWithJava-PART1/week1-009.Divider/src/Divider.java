
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int typedNumber1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int typedNumber2 = Integer.parseInt(reader.nextLine());
        
        double result = (double) typedNumber1 / typedNumber2;
        System.out.println("Division: 3 / 2 = " +result);

        // Implement your program here. Remember to ask the input from user.
    }
}
