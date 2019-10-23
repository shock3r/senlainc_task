package com.senlainc.ignathick.Task3;
public class BoundingBox implements Intersection {

    private Corner LeftButtom;
    private Corner RightTop;
    private Corner LeftTop;
    private Corner RightButton;

    public  BoundingBox(){
    }

    public BoundingBox(Vector vector1) {

        int _x1 = Min(vector1.getX1(), vector1.getX2());
        int _y1 = Min(vector1.getY1(), vector1.getY2());
        int _x2 = Max(vector1.getX1(), vector1.getX2());
        int _y2 = Max(vector1.getY1(), vector1.getY2());

        LeftButtom  = new Corner(_x1, _y1);
        RightTop    = new Corner(_x2, _y2);
        LeftTop     = new Corner(_x1, _y2);
        RightButton = new Corner(_x2, _y1);

    }

    private int Min(int a, int b){
        if (a<=b) {
            return a;
        } else {
            return b;
        }
    }

    private int Max(int a, int b){
        if (a>=b) {
            return a;
        } else {
            return b;
        }
    }

    public Corner getLeftButtom() {
        return LeftButtom;
    }

    public Corner getRightTop() {
        return RightTop;
    }

    public Corner getLeftTop() {
        return LeftTop;
    }

    public Corner getRightButton() {
        return RightButton;
    }

    @Override
    public Boolean hasIntersection(Vector vector1, Vector vector2) {
        BoundingBox BoxVector1 = new BoundingBox(vector1);
        BoundingBox BoxVector2 = new BoundingBox(vector2);

        if (BoxVector1.getRightTop().getX() >= BoxVector2.getLeftButtom().getX() &&
                BoxVector2.getRightTop().getX() >= BoxVector1.getLeftButtom().getX() &&
                BoxVector1.getRightTop().getY()>= BoxVector2.getLeftButtom().getY() &&
                BoxVector2.getRightTop().getY() >= BoxVector1.getLeftButtom().getY()) {
            return true;
        } else {
            return false;
        }
    }
}
