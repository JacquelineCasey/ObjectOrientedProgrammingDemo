package ObjectsAndStuff;

public abstract class Shape {
    // You cannot actually create this
    private String color = "white";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void draw();
}
