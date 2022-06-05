class Quad extends Shape implements Moveable {
    public double width;

    public Quad(double x, double y, double width) {
        super(x, y);
        this.width = width;
        this.name = "Quad";
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
    public void printName() {
        System.out.println(name + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Width: " + width + "\n");
    }
}
