class Hexagon extends Shape implements Moveable {

    public double side;

    public Hexagon(double x, double y, double side) {
        super(x, y);
        this.side= side;
        this.name = "Hexagon";
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
    public void printName() {
        System.out.println( name + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Side ="+side + "\n");
    }

}