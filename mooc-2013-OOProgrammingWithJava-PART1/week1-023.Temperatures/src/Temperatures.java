
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Input today's temperature: ");
            double graphNum = Double.parseDouble(reader.nextLine());

            if (!(graphNum < -30) && !(graphNum > 40)) {
                Graph.addNumber(graphNum);
            }
        }
    }
    
}