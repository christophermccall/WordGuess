package com.github.zipcodewilmington;

import java.util.Random;

/*find out hot to Generate a random word
- use array inside of class?
*/
/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

public class Hangman {
    //Chris McCall
    private String grape;
    private String orange;
    private String toothpaste;

    public Hangman (String grape, String orange, String toothpaste){

        this.grape = grape;
        this.orange = orange;
        this.toothpaste = toothpaste;



    }

        public String getGrape(){
        return grape;
        }

        private void setGrape(String grape){
        this.grape = grape;
        }

        public String getOrange(){
        return orange;
        }

        private void setOrange(String orange){
        this.orange = orange;
        }

        public String getToothpaste(){
        return toothpaste;
        };
        private void setToothpaste(String toothpaste){
            this.toothpaste = toothpaste;
        }





}
