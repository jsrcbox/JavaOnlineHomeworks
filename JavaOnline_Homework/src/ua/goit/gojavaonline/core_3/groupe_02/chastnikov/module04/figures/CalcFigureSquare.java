package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.figures;


import com.sun.org.apache.regexp.internal.RE;

public class CalcFigureSquare {
    static double calcFigureSquare(Figure figure) {
        if(! (figure instanceof Triangle || figure instanceof Rectangle || figure instanceof Circle))
            throw new IllegalArgumentException("Unknown figure. The system recognizes a triangles, rectangles and circles");
        if(figure instanceof Triangle) {
            double sideA = ((Triangle)figure).sideA;
            double sideB = ((Triangle)figure).sideB;
            double sideC = ((Triangle)figure).sideC;
            double p = (sideA + sideB + sideC) / 2;
            return Math.sqrt((p*(p-sideA) * (p-sideB) * (p-sideC)));
        }

        else if (figure instanceof Circle)
            return 3.14 * Math.pow(((Circle) figure).radius, 2);

        else if(figure instanceof Rectangle)
            return ((Rectangle)figure).sideA * ((Rectangle)figure).sideB;

        else return 0;
    }
}
