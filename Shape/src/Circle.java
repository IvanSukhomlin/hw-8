class Circle extends Shape implements Moveable {
    public double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
        this.name = "Circle";
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
    public void printName() {
        System.out.println ("Circle" + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Radius: " + radius + "\n");
    }
}