/* Max run & Blow Up
 * Created by: Maria Temu
 * Created on: 17-Feb-2020
 * Created for: ICS4U
 * Assignment 1 (String Stuff)
 * This program reads a text file and outputs the the max run of a character
 * and the blown up string :)
 */
package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.util.



public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("trialtext1.txt"));
        String answer = input.nextLine();
        System.out.println("The text file reads: " + (answer));

        String maxRunAns = answer;
        System.out.println("The character that repeats the most is: " + (maxRep(maxRunAns)));

        Scanner input2 = new Scanner(new File("trialtext2.txt"));
        String answer2 = input2.nextLine();

        String blowUpAns = answer2 ;
        System.out.println("The blown up string is: " + (blowUp(blowUpAns)));
    }


    static char maxRep(String str) {

        int currentCount = 1;
        int count = 0;
        int strLength = str.length();
        char r = str.charAt(0);


        for (int rep = 0; rep < strLength; rep++) {
            // If cur character and next matdh
            if (rep < strLength - 1 && str.charAt(rep) == str.charAt(rep + 1))

                currentCount++;

            else
            // If their isn't a match reset the counter
            {
                if (count < currentCount) {
                    r = str.charAt(rep);
                    count = currentCount;

                }
                currentCount = 1;
            }
        }

        return r;
    }

    public static String blowUp(String str) {
        //StringBuilder sb = new StringBuilder(128);
        StringBuilder stringbuild = new StringBuilder();

        // get default capacity
        //int capacity = str.capacity();
        //capacity = str.capacity();

        if (str.length() == 0) {

            return "Error: Please input a string in the text file!";
            //System.out.println("Error: Please input a string in the text file!");
        }

        else

            {

            for (int count = 0; count < str.length(); count++)
            {

                char m = str.charAt(count);

            if (Character.isDigit(m) && count < str.length() - 1)
            {
                char next = str.charAt(count + 1);

                int numOfTimes = Integer.parseInt(Character.toString(m));

                for (int j = 0; j < numOfTimes; j++) {
                    stringbuild.append(next);
                }

                count++;

            }
            else if (!Character.isDigit(m))

            {
                stringbuild.append(m);
            }
        }
        return
                stringbuild.toString();
    }
}}

