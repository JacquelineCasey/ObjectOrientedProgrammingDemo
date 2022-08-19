package ObjectsAndStuff;

public class Rectangle extends Shape /* implements SomeInterface */ {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea() {
        return width * height;
    }


    @Override
    public void draw() {
        System.out.println("Rectangle with " + width + " " + height);
    }
    
    // ...
}
