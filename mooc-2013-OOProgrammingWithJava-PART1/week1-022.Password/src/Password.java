
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; 
        
        while (true) {
            System.out.print("Type a password: ");
            String myPassword = reader.nextLine();
            
            if (myPassword.equals(password)) {
                System.out.println("Right!");
                break;                
            }
            System.out.println ("Wrong!");
        }
        System.out.print ("The secret is: mine! ");
    }
}
