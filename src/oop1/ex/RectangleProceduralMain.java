package oop1.ex;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        int widhth = 5;
        int height = 8;
        int area = calculateArea(widhth, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(widhth, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare(widhth, height);
        System.out.println("정사각형 여부 : " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
