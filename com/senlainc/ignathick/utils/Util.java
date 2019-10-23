package com.senlainc.ignathick.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    public static int getScanFromKeyboard() {

        int i = 0;
        Scanner sc = new Scanner(System.in);

        try{
            i = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input from keyboard does not match the Integerregular expression, or is out of range");
            return -1;
        }

        if (i > 0) {
            return i;
        } else {
            return -1;
        }

    }

    public static String getScanFromStringKeyboard() {

        String s;
        Scanner sc = new Scanner(System.in);

        try{
            s = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Input from keyboard does not match string type");
            return "";
        }

        return s;

    }

    public static int [] getScanFromKeyboardToArray() {

        int [] scanArray = new int[8];
        int number = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<scanArray.length; i++) {

            try {
                number = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input from keyboard does not match the Integerregular expression, or is out of range");
                return scanArray;
            }
            scanArray[i] = number;
        }

        return scanArray;

    }

}
