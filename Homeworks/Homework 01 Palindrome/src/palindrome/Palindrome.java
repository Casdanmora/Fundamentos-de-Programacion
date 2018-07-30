package palindrome;

import java.util.Scanner;

/*The longest palindromic word in the Oxford English Dictionary is the onomatopoeic 
tattarrattat, coined by James Joyce in Ulysses (1922) for a knock on the door. */
 
class Palindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("This program will tell you if the text you enter is a palindrome:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
   }
}