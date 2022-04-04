abstract class Shape // parent class
{
    abstract float getPerimeter();
}

interface NameOfTheShape // interface class
{
    public void showShapeName(); // abstract method
}

class Rectangle extends Shape implements NameOfTheShape // child class of Shape that implements NameOfTheShape interface
{
    private float l, b; // length and breadth of the rectangle

    Rectangle(float l, float b) // constructor
    {
        this.l = l;
        this.b = b;
    }

    public void showShapeName() // method to print shape name
    {
        System.out.println("Rectangle");
    }

    public float getPerimeter() // Overriding method to calculate perimeter of the shape rectangle
    {
        return 2 * (l + b);
    }

    public double getPerimeter(double len, double bre) // Method overloading
    {
        return 2 * (len + bre);
    }

}

class Square extends Shape implements NameOfTheShape // child class of Shape that implements NameOfTheShape interface
{
    private float s; // sides of a square

    Square(float s) // constructor
    {
        this.s = s;
    }

    public void showShapeName() // method to print shape name
    {
        System.out.println("Square");
    }

    public float getPerimeter() // Overriding method to calculate perimeter of the shape Square
    {
        return 4 * s;
    }

}

class Triangle extends Shape implements NameOfTheShape {
    private float s1, s2, s3; // three sides of a triangle

    Triangle(float s1, float s2, float s3) // constructor
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void showShapeName() // method to print shape name
    {
        System.out.println("Triangle");
    }

    public float getPerimeter() // Overriding method to calculate perimeter of the shape Triangle
    {
        return s1 + s2 + s3;
    }

    public boolean isRightAngle() // method to identify if the triangle is right angled using Pythagoras Theorem
    {
        if (s1 > s2 && s1 > s3) {
            if (s1 * s1 == s2 * s2 + s3 * s3)
                return true;
            else
                return false;
        }
        if (s2 > s1 && s2 > s3) {
            if (s2 * s2 == s1 * s1 + s3 * s3)
                return true;
            else
                return false;
        } else {
            if (s3 * s3 == s1 * s1 + s2 * s2)
                return true;
            else
                return false;
        }

    }

}

class AppRunner {
    public static void main(String[] args) {
        Triangle t = new Triangle(4, 5, 3); // object of class Triangle
        System.out.println("Shape name: ");
        t.showShapeName();
        float tPerimeter = t.getPerimeter();
        System.out.println("Perimeter of the triangle: " + tPerimeter + " units");
        if (t.isRightAngle() == true)
            System.out.println("It is a Right angled triangle");
        else
            System.out.println("It not Right angled triangle");

        Rectangle r = new Rectangle(5.8F, 3); // object of class Rectangle
        System.out.println("\nShape name: ");
        r.showShapeName();
        float rPerimeter = r.getPerimeter();
        System.out.println("Perimeter of the rectangle: " + rPerimeter + " units");

        Square sq = new Square(22.4F); // object of class Square
        System.out.println("\nShape name: ");
        sq.showShapeName();
        float sqPerimeter = sq.getPerimeter();
        System.out.println("Perimeter of the square: " + sqPerimeter + " units");
    }
}