package day12_practice_tasks;
public class Rectangle {
    private double width;     private double length;
    public double getWidth() {return width;}

    public double getLength() {return length;}
    public void setInfo(double width, double length) {
        if ( length <= 0  ) {
            System.err.println(" Lenght can not be negative oder zero: " + length);
            System.exit(1);
        }
        if ( width <= 0  ) {
            System.err.println(" Width can not be negative oder zero: " + width);
            System.exit(1);
        }
        this.width = width;
        this.length = length;
    }
    public double calculateArea(){
        return width*length;
    }
    public double calculatePerimeter(){
        return 2*(width * length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                " length=" + length +
                ", Area is= " + calculateArea()+
                ", Perimeter is= " + calculatePerimeter()+
                '}';
    }
}
/* Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object*/