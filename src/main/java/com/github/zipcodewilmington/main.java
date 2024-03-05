package com.github.zipcodewilmington;
import java.util.Scanner;

public class main {
    static Wordguess wordguess = new Wordguess();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
            char[] answer = wordguess.getSecret();
            char[] userInput = wordguess.getUserInput();
            char[] guess = wordguess.getGuess();

            int i = 0;

                

                System.out.print(guess);
                for (int j = 0; j < answer.length; j++)
                    if (userInput[0] == answer[j]) {
                        guess[j] = userInput[0];
                    }
            }
        }


