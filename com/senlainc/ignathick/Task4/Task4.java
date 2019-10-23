package com.senlainc.ignathick.Task4;
//Задание 4
//        Необходимо написать рекурсивный алгоритм для нахождения НОД
//        и НОК двух чисел. Два числа вводятся вручную во время
//        выполнения программы.
public class Task4 {

    int a;
    int b;

    public Task4(int a, int b) {
        this.a = a;
        this.b = b;

        System.out.println("Greatest common divisor: " + gcd(a,b));
        System.out.println("Least common multiple: " + lcm(a,b));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    private int  lcm(int a, int b) {
        if (gcd(a,b)==0) {
            return 0;
        } else {
            return a/gcd(a,b)*b;
        }
    }

}
