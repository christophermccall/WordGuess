package com.github.zipcodewilmington;
import java.util.Scanner;

public class main {

    static Wordguess wordguess = new Wordguess();


    public static void main(String[] args) {

        while (true) {

            System.out.println("1.) START NEW GAME"+"\n"+"2.) EXIT");
            if(wordguess.userInput()==1) {

                //make the game a loop so you don't have to run the program everytime!
                Scanner scanner = new Scanner(System.in);


                // get the hidden answer
                char[] answer = wordguess.getSecret();
                // initialized a new StringBuilder with the same length as the answer.
                StringBuilder guess = new StringBuilder(answer.length);
                // replaced for loop with repeat method
                //added _ for every letter position in guess
                guess.append("_".repeat(answer.length));

                //Title

                System.out.println("Welcome to WordGuess!" + "\n" + "Guess a letter to begin");

                System.out.println(guess);


                int i = 0;
                while (i < answer.length) {
                    //take user's input
                    char attempt = scanner.nextLine().charAt(0);
                    //if the user input matches any letter in the secret word
                    for (int j = 0; j < answer.length; j++)
                        if (attempt == answer[j]) {
                            //set char used to update the guess log.
                            guess.setCharAt(j, answer[j]);
                        }
                    // display new guess log
                    System.out.println(guess+"\n");
                    //check to see if they guessed all the correct letters
                    i++;
                }
                //check if they guessed all the correct letters
                String correct = new String(answer);
                if (guess.toString().compareTo(correct) == 0) {
                        //if they did
                    System.out.println("Congrats! your prize money" +"\n"+
                            "will be mailed to you " +"\n"+
                            "within 12-64 business days!"+"\n");
                } else { //if not
                    System.out.println("TOO BAD!"+"\n");
                }
            } else if(wordguess.userInput()==2){
                System.exit(0);
            }

        }
    }
}



