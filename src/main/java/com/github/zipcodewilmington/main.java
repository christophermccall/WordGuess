package com.github.zipcodewilmington;
import java.util.Scanner;

public class main {

    static Wordguess wordguess = new Wordguess();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        char[] answer = wordguess.getSecret();
        char[] userInput = wordguess.getUserInput();
        char[] guess = wordguess.getGuess();
        char[] test = new char[]{'t','e','s','t'};

        int i = 0;
        while (i < answer.length) {

            System.out.print(guess);

            wordguess.getUserInput();
            for (int j = 0; j < answer.length; j++)
                if (userInput[0] == answer[j]) {
                    guess[j] = userInput[0];
                }
            i++;
        }
    }
}

