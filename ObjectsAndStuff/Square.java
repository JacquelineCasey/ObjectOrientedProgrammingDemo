package ObjectsAndStuff;

public class Square extends Rectangle {
    // anything that is public or protected

    // CalculateArea()
    // ctor
    // perimeter

    public Square(int side) {
        super(side, side);
        // Rectangle(width = side, height = side)

        // you can do other stuff.
    }

    int getSide() {
        return getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Square with " + getHeight());
    }


}
