package week_08.assignments;

public class Question_08_07 {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}
        };
        int point1 = 0;
        int point2 = 1;
        double currentNearestThreePoints = findTheNearestThreePoints(points[point1][0], points[point1][1], points[point1][2],
                points[point2][0], points[point2][1], points[point2][2]);

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double nearestThreePoints = findTheNearestThreePoints(points[i][0], points[i][1], points[i][2], points[j][0],
                        points[j][1], points[j][2]);
                if (nearestThreePoints < currentNearestThreePoints) {
                    currentNearestThreePoints = nearestThreePoints;
                    point1 = i;
                    point2 = j;
                }
            }
        }
        System.out.println("The closest three points are(" + points[point1][0] + "," + points[point1][1] + "," + points[point1][2] + ") and (" +
                points[point2][0] + "," + points[point2][1] + "," + points[point2][2] + ")");
    }

    public static double findTheNearestThreePoints(double v, double v1, double v2, double v3, double v4, double v5) {
        return Math.sqrt(Math.pow(v - v3, 2) + Math.pow(v1 - v4, 2) + Math.pow(v2 - v5, 2));
    }
}
