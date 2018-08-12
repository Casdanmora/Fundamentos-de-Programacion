
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int typedNumber1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int typedNumber2 = Integer.parseInt(reader.nextLine());
        
        int result = typedNumber1 + typedNumber2;
        System.out.println("Sum of the numbers: " +result);

        // Implement your program here. Remember to ask the input from user
    }
}
