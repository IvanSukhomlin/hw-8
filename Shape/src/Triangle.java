class Triangle extends Shape implements Moveable {
    public double a;
    public double b;
    public double c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a= a;
        this.b = b;
        this.c = c;
        this.name = "Triangle";
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
    public void printName() {
        System.out.println (name + "\n" +"X="+x+"\n"+"Y="+y+"\n"+ "Side A="+a+"\n"+"Side B="+b+"\n"+"Side C="+c+"\n" );
    }

}