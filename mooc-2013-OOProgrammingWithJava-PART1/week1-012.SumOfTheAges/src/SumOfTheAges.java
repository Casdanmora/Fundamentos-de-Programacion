
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameuser1 = reader.nextLine();

        System.out.println("Type your age: ");
        int ageuser1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String nameuser2 = reader.nextLine();

        System.out.println("Type your age: ");
        int ageuser2 = Integer.parseInt(reader.nextLine());

        int result = ageuser2 + ageuser1;
        System.out.println(nameuser1 + " and " + nameuser2 + " are " + result + " years in total.");

        // Implement your program here
    }
}
