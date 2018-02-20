package pl.wasiewski.oopbasics;

import java.util.Scanner;

/**
 * Created by Kris on 2017-10-24.
 */
public class Point {

    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void settingXY() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the x value for the point");
        int x = sc.nextInt();
        sc.nextLine();
        setX(x);
        System.out.println("Please type the y value for the point");
        int y = sc.nextInt();
        sc.nextLine();
        setY(y);

    }

    public float distanceFromOrigin(int x, int y) {
        float distance = (float)Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,2));
             return distance;
    }


    public void printDistance(int x, int y) {
        System.out.println("The distance from the origin is: " + distanceFromOrigin(x,y));
    }

    public void main(String[] args) {

        Point p1 = new Point();
        p1.settingXY();
        p1.printDistance(p1.getX(),p1.getY());


    }

}