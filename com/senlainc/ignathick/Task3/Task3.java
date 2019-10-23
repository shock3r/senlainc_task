package com.senlainc.ignathick.Task3;

//Задание 3
//        Необходимо написать программу, которая определяет
//        пересекаются ли два отрезка. Координаты отрезков вводятся
//        вручную во время выполнения программы.



public class Task3 {

    private Vector vector1;
    private Vector vector2;

    public Task3(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){

        vector1 = new Vector(x1, y1, x2, y2);
        vector2 = new Vector(x3, y3, x4, y4);

        System.out.println("vector1: " + vector1.toString() + "; vector2: " + vector2.toString() + " has intersection: " + checkThreeRules());

    }

    int [] scanArray = new int[8];

    public Task3(int [] Ar){

        vector1 = new Vector(Ar[0], Ar[1], Ar[2], Ar[3]);
        vector2 = new Vector(Ar[4], Ar[5], Ar[6], Ar[7]);

        System.out.println("vector1: " + vector1.toString() + "; vector2: " + vector2.toString() + " has intersection: " + checkThreeRules());

    }

    //bounding box
    private Boolean checkThreeRules(){

        // www.proklondike.com/var/file/kormen_leiser_algorith.zip
        // page 815

        //1 Bounding Boxes of vector1 and vector2 has Intersection
        BoundingBox boundingBox = new BoundingBox();
        Boolean firstRule = boundingBox.hasIntersection(vector1, vector2);

        //2
        // (p3-p1)*(p2-p1) * (p4-p1)*(p2-p1); <= 0
        // and
        // (p1-p3)*(p4-p3) * (p2-p3)*(p4-p3) <= 0
        Boolean secondAndThirdRule = vector1.hasIntersection(vector1,vector2);

        if (!firstRule) {
            return false;
        } else if (secondAndThirdRule){
            return true;
        } else {
            return false;
        }

    }

}
