package Geometry;

public class Circle{
    private String name;
    private float radius;
    private float height;

    public Circle(String name, float radius) {
        this.name = name;
        this.radius = radius;
        this.height = 0;
    }

    public Circle(String name, float radius, float height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public double printArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double printCircumference(){
        return 2 * Math.PI * radius;
    }
    public double printVolume(){
        return printArea() * height;
    }
    public boolean isCircle(){
        return height == 0;
    }

    @Override
    public String toString(){
        String cylinderLine = isCircle()
                ? name + " is not a cylinder. does not compute"
                : name + " is a cylinder. it has a volume of " + printVolume() + " cubic metres ";
        return name + " has the following properties:\n " +
                name + " \'s area is equal to " + printArea() + " meters squared.\n " +
                ", radius=" + radius +
                ", height= " + height +
                cylinderLine;
    }
    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }
}
