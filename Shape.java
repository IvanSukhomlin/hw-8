abstract class Shape {
    public double x;
    public double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double getArea();
    abstract String printName();
}

class Triangle extends Shape implements Moveable {
    public double a;
    public double b;
    public double c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a= a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea(){
        double p;
        p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String printName() {
        return ("Triangle" + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Side A="+a+"\n"+"Side B="+b+"\n"+"Side C="+c+"\n" );
    }

}

class Hexagonarea extends Shape implements Moveable {

    public double side;

    public Hexagonarea(double x, double y, double side) {
        super(x, y);
        this.side= side;
    }

    @Override
    double getArea(){
        return (6*(Math.pow(side,2)))/(4*(Math.tan(Math.PI/6)));
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    @Override
    public String printName() {
        return ("Hexagonarea" + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Side ="+side + "\n");
    }

}

class Quad extends Shape implements Moveable {
    public double width;

    public Quad(double x, double y, double width) {
        super(x, y);
        this.width = width;
    }
    @Override
    public double getArea() {
        return  width * width;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String printName() {
        return ("Quad" + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Width: " + width + "\n");
    }
}

class Rectangle extends Shape implements Moveable {
    public double height;
    public double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void getCenter() {
        this.x += x / 2;
        this.y += y / 2;
    }

    @Override
    public String printName() {
        return ("Rectangle" + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Height: " + height + "\n" + "Width: " + width + "\n");
    }
}

class Circle extends Shape implements Moveable {
    public double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  (Math.PI * Math.sqrt(radius));
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String printName() {
        return ("Circle" + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Radius: " + radius + "\n");
    }
}

interface Moveable {
    void move(double dx, double dy);
}
class ShowShape{
    public String printShape(Shape myShape){
        return myShape.printName();
    }
}

class TestGraphEditor{
    public static void main(String[] args) {
        System.out.println(new ShowShape().printShape(new Triangle(4.0,5.0,6.0, 7.0, 8.0)));
        System.out.println(new ShowShape().printShape(new Hexagonarea(1.0,2.0,3.0)));
        System.out.println(new ShowShape().printShape(new Quad(9.0,10.0,11.0)));
        System.out.println(new ShowShape().printShape(new Rectangle(12.0,13.0,14.0, 15.0)));
        System.out.println(new ShowShape().printShape(new Circle(16.0,17.0,18.0)));
    }
}
