package week_04.assignments;

import java.math.MathContext;
import java.util.Scanner;

public class Question_04_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        final double atlantaCoordinatex = 33.7489954;
        final double atlantaCoordinatey = -84.3879824;

        final double orlandoCoordinatex = 28.5383355;
        final double orlandoCoordinatey = -81.3792364999;

        final double savannahCoordinatex = 32.0835407;
        final double savannahCoordinatey = -81.09983419999998;

        final double charlotteCoordinatex = 35.2270869;
        final double charlotteCoordinatey = -80.84312669999997;

        double distanceBetweenAtlantaAndOrlando = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaCoordinatex)) * (Math.sin(Math.toRadians(orlandoCoordinatex))) + ((Math.cos(Math.toRadians(atlantaCoordinatex))) * (Math.cos(Math.toRadians(orlandoCoordinatex))) * (Math.cos(Math.toRadians(atlantaCoordinatey - orlandoCoordinatey)))));
        double distanceBetweenAtlantaAndSavannah = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaCoordinatex)) * (Math.sin(Math.toRadians(savannahCoordinatex))) + ((Math.cos(Math.toRadians(atlantaCoordinatex))) * (Math.cos(Math.toRadians(savannahCoordinatex))) * (Math.cos(Math.toRadians(atlantaCoordinatey - savannahCoordinatey)))));
        double distanceBetweenOrlandoAndSavannah = RADIUS * Math.acos(Math.sin(Math.toRadians(orlandoCoordinatex)) * (Math.sin(Math.toRadians(savannahCoordinatex))) + ((Math.cos(Math.toRadians(orlandoCoordinatex))) * (Math.cos(Math.toRadians(savannahCoordinatex))) * (Math.cos(Math.toRadians(orlandoCoordinatey - savannahCoordinatey)))));


        double sBetweenOrlandoAtlantaAndSavannah = (distanceBetweenAtlantaAndOrlando + distanceBetweenAtlantaAndSavannah + distanceBetweenOrlandoAndSavannah)/2;
        double areaBetweenOrlandoAtlantaAndSavannah = Math.sqrt(sBetweenOrlandoAtlantaAndSavannah*(sBetweenOrlandoAtlantaAndSavannah-distanceBetweenAtlantaAndOrlando)*(sBetweenOrlandoAtlantaAndSavannah-distanceBetweenAtlantaAndSavannah)*(sBetweenOrlandoAtlantaAndSavannah-distanceBetweenOrlandoAndSavannah));

        double distanceBetweenAtlantaAndCharlotte = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaCoordinatex)) * (Math.sin(Math.toRadians(charlotteCoordinatex))) + ((Math.cos(Math.toRadians(atlantaCoordinatex))) * (Math.cos(Math.toRadians(charlotteCoordinatex))) * (Math.cos(Math.toRadians(atlantaCoordinatey - charlotteCoordinatey)))));
        double distanceBetweenSavannahAndCharlotte = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahCoordinatex)) * (Math.sin(Math.toRadians(charlotteCoordinatex))) + ((Math.cos(Math.toRadians(savannahCoordinatex))) * (Math.cos(Math.toRadians(charlotteCoordinatex))) * (Math.cos(Math.toRadians(savannahCoordinatey - charlotteCoordinatey)))));

        double sBetweenCharlotteAtlantaAndSavannah = (distanceBetweenAtlantaAndCharlotte+distanceBetweenSavannahAndCharlotte+distanceBetweenAtlantaAndSavannah)/2;
        double areaBetweenCharlotteAtlantaAndSavannah = Math.sqrt(sBetweenCharlotteAtlantaAndSavannah*(sBetweenCharlotteAtlantaAndSavannah-distanceBetweenSavannahAndCharlotte)*(sBetweenCharlotteAtlantaAndSavannah-distanceBetweenAtlantaAndCharlotte)*(sBetweenCharlotteAtlantaAndSavannah-distanceBetweenAtlantaAndSavannah));

        System.out.println("Estimated area enclosed by these four city is "+(areaBetweenCharlotteAtlantaAndSavannah+areaBetweenOrlandoAtlantaAndSavannah));



    }

}
