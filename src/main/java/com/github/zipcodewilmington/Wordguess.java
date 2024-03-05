package com.github.zipcodewilmington;
import java.util.Scanner;
import java.util.Random;
/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

public class Wordguess {
    //Chris McCall
    public int i=0;
    char[] secret ={};
    static Scanner scanner = new Scanner(System.in);

    public int getRandonmNumber() {
        Random rand = new Random();
        return rand.nextInt(6);
    }

    public  char[] getSecret() {
        String[] words = {"grape", "orange", "red", "ladder", "shoe", "dare"};
        return this.secret = words[getRandonmNumber()].toCharArray();
    }

    public char[] getGuess() {
        int i = 0;
        char[] guess = new char[getSecret().length];
        while(i< secret.length){
            guess[i] += '_';
            i++;
        }
        return guess;
    }

    public char[] getUserInput() {
       return scanner.nextLine().toCharArray();
    }

}










/*







 */


