package week_08.assignments;

import java.util.Scanner;

import static week_08.assignments.Question_08_33.createArray;

public class Question_08_31 {
    public static void main(String[] args) {

        System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
        double[][] points = createArray(4);


        double[] intersectingPoint = findIntersectingPoint(points);
        System.out.println("x is " + intersectingPoint[0] + " y is " + intersectingPoint[1]);
    }

    public static double[] findIntersectingPoint(double[][] points) {
        double[] result = new double[2];

        double[] abeOfLinear1 = findAbeOfLinear1(points);
        double[] cdfOfLinear2 = findCdfOfLinear2(points);

        if (abeOfLinear1[0] / cdfOfLinear2[0] == abeOfLinear1[1] / cdfOfLinear2[1]) {
            System.out.println("The two lines are parallel");
            System.exit(1);

        }
        result[0] = ((abeOfLinear1[2] * cdfOfLinear2[1]) - (abeOfLinear1[1] * cdfOfLinear2[2])) / ((abeOfLinear1[0] * cdfOfLinear2[1] - (abeOfLinear1[1] * cdfOfLinear2[0])));
        result[1] = ((abeOfLinear1[0] * cdfOfLinear2[2]) - (abeOfLinear1[2] * cdfOfLinear2[0])) / ((abeOfLinear1[0] * cdfOfLinear2[1] - (abeOfLinear1[1] * cdfOfLinear2[0])));

        return result;
    }

    public static double[] findCdfOfLinear2(double[][] points) {
        double[] result = new double[3];
        result[0] = points[2][1] - points[3][1];
        result[1] = points[2][0] - points[3][0];
        result[2] = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);

        return result;
    }

    public static double[] findAbeOfLinear1(double[][] points) {
//        (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
//        (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        double[] result = new double[3];
        result[0] = points[0][1] - points[1][1];
        result[1] = points[0][0] - points[1][0];
        result[2] = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);

        return result;
    }
}
