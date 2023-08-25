package week_04.assignments;


public class Question_04_06 {
    public static void main(String[] args) {
        final double RADIUS = 40;


        double randomRadius1 = Math.random() * 361;
        double randomRadius2 = Math.random() * 361;
        double randomRadius3 = Math.random() * 361;


        // in this process  we generated random  ( x and y points) in the circle
        double x1 = RADIUS * Math.cos(Math.toRadians(randomRadius1));
        double y1 = RADIUS * Math.sin(Math.toRadians(randomRadius1));

        double x2 = RADIUS * Math.cos(Math.toRadians(randomRadius2));
        double y2 = RADIUS * Math.sin(Math.toRadians(randomRadius2));

        double x3 = RADIUS * Math.cos(Math.toRadians(randomRadius3));
        double y3 = RADIUS * Math.sin(Math.toRadians(randomRadius3));

        double lengthA = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double lengthB = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double lengthC = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        double randomAngle1 = Math.acos((Math.pow(lengthA, 2) - Math.pow(lengthB, 2) - Math.pow(lengthC, 2)) / (-2 * lengthB * lengthC));
        double randomAngle2 = Math.acos((Math.pow(lengthB, 2) - Math.pow(lengthA, 2) - Math.pow(lengthC, 2)) / (-2 * lengthA * lengthC));
        double randomAngle3 = Math.acos((Math.pow(lengthC, 2) - Math.pow(lengthA, 2) - Math.pow(lengthB, 2)) / (-2 * lengthA * lengthB));

        //in the upper process we found radians , to convert degrees we should use toDegrees method
        //note:we use the Math.abs method owing to possibility of negative radius
        randomAngle1 = Math.toDegrees(Math.abs(randomAngle1));
        randomAngle2 = Math.toDegrees(Math.abs(randomAngle2));
        randomAngle3 = Math.toDegrees(Math.abs(randomAngle3));

        System.out.println(randomAngle1 + "," + randomAngle2 + "," + randomAngle3);

    }
}
