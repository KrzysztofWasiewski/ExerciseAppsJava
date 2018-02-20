package Arithmetics;

/**
 * Created by Kris on 2017-12-09.
 */
public class Circle {

    private double poleRadius;

    public Circle() {
        poleRadius = 0;
    }

    public double getPoleRadius() {
        return poleRadius;
    }

    public void setPoleRadius(double poleRadius) {
        if (poleRadius < 0) {
            System.out.println("The radius cannot me lower than 0");
        } else {
            this.poleRadius = poleRadius;
        }
    }

    double pole() {
        return (Math.PI * Math.pow(poleRadius,2));
            }

    double circumference() {
        return 2 * Math.PI * poleRadius;

    }


}
