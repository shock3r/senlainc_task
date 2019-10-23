package com.senlainc.ignathick;

import com.senlainc.ignathick.Task1.Task1;
import com.senlainc.ignathick.Task2.Task2;
import com.senlainc.ignathick.Task3.Task3;
import com.senlainc.ignathick.Task4.Task4;
import com.senlainc.ignathick.Task5.Task5;
import com.senlainc.ignathick.Task6.Task6;
import com.senlainc.ignathick.utils.Util;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter task number:");
        int chooseNumber = Util.getScanFromKeyboard();

        if (chooseNumber == 1) {

            System.out.println("Enter number to view simple numbers [1, N]");
            Task1 t1 = new Task1(Util.getScanFromKeyboard());

        } else if (chooseNumber == 2) {

            System.out.println("Enter Fibonachii sequence lenght [N]");
            Task2 t2 = new Task2(Util.getScanFromKeyboard());

        } else if (chooseNumber == 3) {

            System.out.println("Examples of task #3:");
            Task3 t3_1 = new Task3(-1,-1,3,2,-1,2,2,-1);
            Task3 t3_2 = new Task3(1,1,3,3,-1,-1,5,-1);
            Task3 t3_3 = new Task3(0,0,10,0,-10,0,-5,0); // place in same line
            System.out.println("Please enter x1, y1, x2, y2, x3, y3, x4, y4. Use Enter after every input:");
            int [] scanArray = new int[8];
            scanArray = Util.getScanFromKeyboardToArray();
            Task3 userVectors = new Task3(scanArray);

        } else if (chooseNumber == 4) {

            System.out.println("Please enter number a,b to find NOK, NOD");
            System.out.println("Please enter number a value");
            int a = Util.getScanFromKeyboard();
            System.out.println("Please enter number b value");
            int b = Util.getScanFromKeyboard();
            Task4 t4 = new Task4(a, b);

        } else if (chooseNumber == 5) {

            System.out.println("Please enter string to check for palindrome");
            String s = Util.getScanFromStringKeyboard();
            Task5 t5 = new Task5(s);
            System.out.println("" + t5.getValue() + " | " + t5.getMirrorValue() + ": " + t5.isPalindrome());

        } else if (chooseNumber == 6) {

            System.out.println("Please string with some letters and numbers");
            String s = Util.getScanFromStringKeyboard();
            Task6 t6 = new Task6(s);
            System.out.println("You enter: " + t6.getValue() + ". Line without letter is: " + t6.removeNumbers());

        }

    }
}
