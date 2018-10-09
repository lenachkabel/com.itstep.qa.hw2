package com.itstep.qa.runner;

import com.itstep.qa.konstruktor.Square;

public class SquareRunner {
    public static void main(String[] args) {
        Square square = new Square(2);
        Square square1 = new Square();
        Square square2 = new Square(3);
        square2.getSquare();
        System.out.println("Площадь квадрата" +square2.getSquare());
        square.vol(3);
        square.getSquare();
    }
}
