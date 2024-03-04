package oop.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rct = new Rectangle();
        rct.width = 6;
        rct.height = 8;

        int area = rct.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rct.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rct.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
