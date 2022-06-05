abstract class Shape {
    public double x;
    public double y;
    public String name;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
        this.name = "Shape";

    }

    abstract double getArea();
    abstract void printName();
}