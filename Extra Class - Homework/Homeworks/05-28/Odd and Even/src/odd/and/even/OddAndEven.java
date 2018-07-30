package odd.and.even;

import java.util.Scanner;

public class OddAndEven {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int odd = 0;
        int even = 0;
       
        while (true) {
            System.out.print("Enter any amount of numbers you would like, and this program will tell you how many of them are odd or even. Type 0 to get your results: ");
            int input = Integer.parseInt(reader.nextLine());
            if (input == 0) {
                System.out.println("There were " + even + " even numbers entered");
                System.out.println("There were " + odd + " odd numbers entered");
                break;
            } else if (input % 2 != 0) {
                odd++;
            } else if (input % 2 == 0) {
                even++;
            }
        }
    }
}
