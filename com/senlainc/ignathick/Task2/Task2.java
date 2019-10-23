package com.senlainc.ignathick.Task2;

import java.util.LinkedList;

//Задание 2
//        Необходимо написать рекурсивный алгоритм, который находит
//        числа Фибоначчи в пределах от 1 до N. N – вводится вручную во
//        время выполнения программы.

public class Task2 {
    // lenght of fibonachii sequence [1, number]
    private int number = 0;

    //Constructor
    public Task2(int i) {
        this.number = i;
        printFibonachiiSequence();
    }

    //recursive method of gettiong member of fibonacci sequence
    private int getFibonachiiMember(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return getFibonachiiMember(n - 1) + getFibonachiiMember(n - 2);
        }
    }

    //return list with fibonacci sequence
    private LinkedList<Integer> getFibonachiiList(int maximumSumm) {
        LinkedList<Integer> fibonachiiList = new LinkedList<Integer>();
        for (int i = 0; i < maximumSumm; i++) {
            int tempSumm = getFibonachiiMember(i);
            if (tempSumm <= maximumSumm) {
                fibonachiiList.addLast(tempSumm);
            } else {
                return fibonachiiList;
            }
        }
        return fibonachiiList;
    }

    //print fibonacci sequence
    private void printFibonachiiSequence() {
        System.out.println("Fibonachii sequence [1, " + number + "]: " + getFibonachiiList(number));
    }
}
