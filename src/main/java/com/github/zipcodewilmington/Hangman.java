package com.github.zipcodewilmington;

import java.util.Random;
/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

public class Hangman {
    //Chris McCall
    public static void main(String[] args){

        String[] words = {
                "grape", "orange", "red","ladder","shoe","tools"
        };
        Random rand = new Random();
        int randint = rand.nextInt(6);


        System.out.println(words[randint]);


    }
    }
    

