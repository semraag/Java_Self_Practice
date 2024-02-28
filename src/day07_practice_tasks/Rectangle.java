package day07_practice_tasks;

public class Rectangle {

    public double width,length;
    public void calculateArea(){
        double calculateArea = width *length;
        System.out.println("Area of rectangle = " +calculateArea);
    }
    public void calculatePerimeter(){
        double calculatePerimeter = (width + length)* 2;
        System.out.println("Perimeter of rectangle = " +calculatePerimeter);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}


/* Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.*/