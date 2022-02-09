package org.WalkerCC_CompSci;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void FlipVertical() {
        x = x*-1;
    }

    public void FlipHorizontal() {
        y = y*-1;
    }

    public void Translate(double xChange, double yChange){
        x = x+xChange;
        y = y+yChange;
    }
}
