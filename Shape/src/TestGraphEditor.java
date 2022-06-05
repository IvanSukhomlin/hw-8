class TestGraphEditor{
    public static void main(String[] args) {
        new ShowShape().printShape(new Triangle(4.0,5.0,6.0, 7.0, 8.0));
        new ShowShape().printShape(new Hexagon(1.0,2.0,3.0));
        new ShowShape().printShape(new Quad(9.0,10.0,11.0));
        new ShowShape().printShape(new Rectangle(12.0,13.0,14.0, 15.0));
        new ShowShape().printShape(new Circle(16.0,17.0,18.0));
    }
}