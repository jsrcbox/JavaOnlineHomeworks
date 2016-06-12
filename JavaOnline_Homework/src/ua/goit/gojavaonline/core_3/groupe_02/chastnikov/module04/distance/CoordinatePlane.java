package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.distance;


public class CoordinatePlane {
    static double getDistance (int x1, int y1, int x2, int y2) throws IllegalArgumentException {
        if(x1 > 100 || y1 > 100 || x2 > 100 || y2 > 100) {
            throw new IllegalArgumentException("the value of each of the parameters can not be more than 100".toUpperCase());
        }
        return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
    }
}
