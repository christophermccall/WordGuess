package com.github.zipcodewilmington;
import java.util.Scanner;

public class main {

    static Wordguess wordguess = new Wordguess();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] answer = wordguess.getSecret();
        // initialized a new stringbuilder with the same length as the answer.
        StringBuilder guess = new StringBuilder(answer.length);
        // replaced for loop with repeat method
        //added _ for every letter position in guess
        guess.append("_".repeat(answer.length));

        int i = 0;
        while (i < answer.length) {
            //take user's input
            char attempt = scanner.nextLine().charAt(0);
            //if the user input matches any letter in the secret word
            for (int j = 0; j < answer.length; j++)
                if (attempt == answer[j]) {
                    //set char used to update the guess log.
                    guess.setCharAt(j,answer[j]);
                }
            // display new guess log
            System.out.println(guess);
            i++;
        }
    }
}
