package Geometry;

public class Rectangle {
    private String name;
    private float length;
    private float width;
    private float height;

    public Rectangle(String name, float v, float length) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = 0;
    }

    public Rectangle(String name, float length, float width, float height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length * 2) + (width * 2);
    }

    public double volume() {
        return area() * height;
    }
    public boolean isRectangle(){
        return height == 0;
    }

    @Override
    public String toString() {
        String rectangleLine = isRectangle()

                ? name + " is not a cube. does not compute"
                : name + " is a cube. it has a volume of " + volume() + " cubic metres ";
        return name + " has the following properties:\n " +
                name + " \'s area is equal to " + area() + " meters squared.\n " +
                name + "\'s perimeter is equal to " + perimeter() + " metres.\n" +
                name + " \'s volume is equal to " + volume() + "metres squared. \n" +
                rectangleLine;
    }
}
