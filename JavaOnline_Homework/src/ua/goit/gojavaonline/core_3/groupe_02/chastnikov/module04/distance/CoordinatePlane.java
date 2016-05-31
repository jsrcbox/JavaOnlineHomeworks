package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.distance;


public class CoordinatePlane {
    static double getDistance (int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
    }
}
