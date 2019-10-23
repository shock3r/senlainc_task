package com.senlainc.ignathick.Task3;

public class Vector implements Intersection {

    private int x1=0;
    private int y1=0;

    private int x2=0;
    private int y2=0;

    @Override
    public String toString() {
        return "Vector{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    public Vector(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    @Override
    public Boolean hasIntersection(Vector vector1, Vector vector2) {

        int x1 = vector1.getX1();
        int y1 = vector1.getY1();
        int x2 = vector1.getX2();
        int y2 = vector1.getY2();
        int x3 = vector2.getX1();
        int y3 = vector2.getY1();
        int x4 = vector2.getX2();
        int y4 = vector2.getY2();

        int multiP3P1P2P1 = multiplicationVector(x3-x1,y3-y1,x2-x1, y2-y1); //(p3-p1)*(p2-p1);
        int multiP4P1P2P1 = multiplicationVector(x4-x1,y4-y1,x2-x1, y2-y1); //(p4-p1)*(p2-p1);
        int multiP1P3P4P3 = multiplicationVector(x1-x3,y1-y3,x4-x3, y4-y3); //(p1-p3)*(p4-p3);
        int multiP2P3P4P3 = multiplicationVector(x2-x3,y2-y3,x4-x3, y4-y3); //(p2-p3)*(p4-p3);

        if ((multiP3P1P2P1 * multiP4P1P2P1 <= 0 ) && (multiP1P3P4P3 * multiP2P3P4P3 <= 0)) {
            return true;
        } else {
            return false;
        }

    }

    int multiplicationVector(int ax, int ay, int bx, int by){

        return ax*by-bx*ay;

    }
}
