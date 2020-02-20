package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File ("trialtext1.txt"));
        String answer = input.nextLine();
        System.out.println ("The text file reads: " + (answer));

        String str4 = answer;
        System.out.println ("The character that repeats the most is: " + (maxRep(str4)));
    }




    static char maxRep(String str)
    {

        int cur_count = 1;
        int count = 0;
        int strLength = str.length();
        char res = str.charAt(0);


        for (int rep = 0; rep < strLength; rep++)
        {
            // If cur character and next matdh
            if (rep < strLength - 1 && str.charAt(rep) == str.charAt(rep + 1))

                cur_count++;

            else
            // If their isn't a match reset the counter
            { if (cur_count > count)
                {
                    count = cur_count;
                    res = str.charAt(rep);
                }
                cur_count = 1; }
        }

        return res;
    }

}
