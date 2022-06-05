class Rectangle extends Shape implements Moveable {
    public double height;
    public double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
        this.name = "Rectangle";
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
    public void printName() {
        System.out.println(name + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Height: " + height + "\n" + "Width: " + width + "\n");
    }
}
