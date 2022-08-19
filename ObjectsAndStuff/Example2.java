package ObjectsAndStuff;

import java.util.*;

public class Example2 /* extends Object */ {
    // Instance variables (object variables, or fields)
    private int x; // different inheritance
    private int y;
    private int z;

    private static int times_created = 0;

    public Example2(int x, int y, int z) {
        // Do some actual work here to open a file, or set other stuff up.

        this.x = x;
        this.y = y;
        this.z = z;

        times_created++;

        System.out.println(this);
    }

    public Example2(int x) {
        this(x, x, x);
    }

    // Getters and Setters: Encapsulation and Validation
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x <= 0) {
            // throw new IllegalArgumentException();
            x = 0;
        }
        this.x = x;
    }

    public int sum() {
        int s =  x + y + z;
        return s;
    }

    @Override
    public String toString() {
        return "Example2 object";
    }

    static void pretty_print(Example2 obj) {
        System.out.println("{" + obj.x + " " + obj.y + " " + obj.z + "}");
    }

    public static void main(String[] args) {
        Example2 ex = new Example2(2, 3, 4);
        Example2 ex2 = new Example2(2, 3, 400);
        // Example2 ex3 = new Example2(1);

        System.out.println(ex.sum());

        ex.setX(-100);

        System.out.println(ex.sum());

        System.out.println(Example2.times_created + " objects created.");

        Example2.pretty_print(ex2);

        Square sq = new Square(4);

        System.out.println(sq.calculateArea()); // 16

        sq.draw();

        System.out.println(sq.getColor());

        Shape sh = sq;
        sh.draw();
        // sh.getSide(); // NOPE
        Rectangle r = sq;
        r.getHeight();
        // r.getSide(); // NOPE

        Shape shapes[] = {new Square(3), new Rectangle(1, 4), new Circle(33)};
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(6);
        arr.add(10);

        List<Integer> list = arr;
        // Print through the list variable
        for (int i : list) {
            System.out.println(i);
        }

        // List<Integer> list2 = new List<>(); // NOPE: List is an interface


        System.out.println("Drawing all the shapes!");
        for (Shape s : shapes)
            s.draw();

        /// Tons of classes, student (tuition, name), teacher (salary, name), 
    }

    /*
     * public UniversityMember()
     */

     /*
      * public Student() {
        super(); // UniversityMember()
      }
      */

       /*
      * public Teacher() {
        super(); // UniversityMember()
      }
      */
}
