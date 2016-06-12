package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.figures;

public class Test {
    public static void main(String[] args) {
        double result;
        result = CalcFigureSquare.calcFigureSquare(new Triangle(7, 6, 9));
        System.out.println(result);
        result = CalcFigureSquare.calcFigureSquare(new Rectangle(2, 3));
        System.out.println(result);
        result = CalcFigureSquare.calcFigureSquare(new Circle(5.4));
        System.out.println(result);
        result = CalcFigureSquare.calcFigureSquare(new Pentagon());
        System.out.println(result);


    }
}
