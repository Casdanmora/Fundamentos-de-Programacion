package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        boolean hasWinner = false;
        boolean isOPlaying = true;
        Scanner sc = new Scanner(System.in);
        String[][] board = {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" }
        };
        MatrixHelper helper = new MatrixHelper();

        while (!hasWinner) {
            boolean isValidMove = false;
            helper.print(board);
            while (!isValidMove) {
                System.out.println("Player " + (isOPlaying ? "O" : "X") + ", select your position");
                int position = sc.nextInt() - 1;
                int row = position / 3;
                int col = position - (3 * row);
                if (board[row][col] == "O" || board[row][col] == "X") {
                    System.out.println("Invalid play");
                } else {
                    board[row][col] = isOPlaying ? "O" : "X";
                    isValidMove = true;
                }   
            }

            isOPlaying = !isOPlaying;
            hasWinner = helper.checkWinner(board);
        }
        
        System.out.println("We got a winner!");
        helper.print(board);
    }
    
}