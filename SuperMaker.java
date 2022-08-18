package Facade;

public class SuperMaker { //facade Class
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public SuperMaker() {
        circle =  new Circle();
        rectangle =  new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawrectangle(){
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
