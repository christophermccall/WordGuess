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
    char[] secret = {};
    static Scanner scanner = new Scanner(System.in);


    public int getRandonmNumber() {
        Random rand = new Random();
        return rand.nextInt(6);
    }

    public char[] getSecret() {
        //test "ladder", "ladder", "ladder", "ladder", "ladder", "ladder"
        //word bank "grape", "orange", "red", "ladder", "shoe", "dare"
        String[] words = {"ladder", "ladder", "ladder", "ladder", "ladder","ladder"};

        return this.secret = words[getRandonmNumber()].toCharArray();
    }

    public int userInput(){
        int usin = scanner.nextInt();
        return usin;
    }
}









/*







 */


