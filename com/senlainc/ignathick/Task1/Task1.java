package com.senlainc.ignathick.Task1;

//Задание 1
//        Необходимо написать программу, которая вычисляет простые
//        числа в пределах от 1 до N. N – вводится вручную во время
//        выполнения программы.

interface Simple {
    boolean isSimple(int n);
}

public class Task1 {
    // lenght of simple numbers [1, number]
    private int number = 0;

    //Constructor
    public Task1(int i) {
        this.number = i;
        printSimpleNumbers();
    }

    // lambda block. check is this number is simple number
    Simple simple = (n) -> {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    };

    //Print simple numbers
    private void printSimpleNumbers() {
        System.out.print("Simple numbers [1, " + number + "]: ");
        for (int i = 1; i <= number; i++) {
            if (simple.isSimple(i)) {
                System.out.print(i + "; ");
            }
        }
    }

}
