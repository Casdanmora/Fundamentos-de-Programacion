
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        System.out.println("");
        System.out.println("Grade: ");

        if (points <= 29) {
            System.out.println("Failed");
        } else if (points <= 34) {
            System.out.println("1");
        } else if (points <= 39) {
            System.out.println("2");
        } else if (points <= 44) {
            System.out.println("3");
        } else if (points <= 49) {
            System.out.println("4");
        } else if (points <= 60) {
            System.out.println("5");
        }
        
    }
}    
