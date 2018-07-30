/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words.counter;

import java.util.Scanner;

class WordsCounter {

    public static void main(String args[]) {

        System.out.println("Enter a sentence or phrase, and this program will tell you how many words are in it: ");

        Scanner s = new Scanner(System.in); // Add scanner
        String str = s.nextLine(); // Read next user input and convert to a string

        String words[] = str.trim().split(" "); // Split string with spaces

        System.out.println("Words in the sentence: " + words.length);

    }
}
