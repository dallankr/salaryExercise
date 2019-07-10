package Geometry;

public class Geometry {
    public static void main(String[] args) {
        final int       length = 5;
        Circle[] cylinders = new Circle[5];
        Rectangle[] rectangles = new Rectangle[5];

        cylinders[0] = new Circle("manhole", 1.5f);
        cylinders[4] = new Circle("tower of pisa", 15.6f, 57.0f);

        rectangles[0] = new Rectangle("taylor field", 110.0f, 30.5f);
        rectangles[1] = new Rectangle("madisson square gardens", 200.0f, 200.0f, 200.0f);

        for (int i = 0; i < length; i++){
            if (cylinders[i] != null) {
                System.out.println(cylinders[i].toString());
                cylinders[i].getName().equals("null");
            }
            if (rectangles[i] != null) {

                System.out.println(rectangles[i].toString());
                    }
            }
    }
}
