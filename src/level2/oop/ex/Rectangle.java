package level2.oop.ex;

public class Rectangle {

    int width;
    int height;

    int calculateArea() {
    return width * height;
    }

    int calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }
}
