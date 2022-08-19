package ObjectsAndStuff;

public class Circle extends Shape {
    private int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    void draw() {
        System.out.println("Circle with " + radius);
    }
    
}
