package Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        SuperMaker sMaker = new SuperMaker();
        sMaker.drawCircle();
        sMaker.drawrectangle();
        sMaker.drawSquare();
    }
}
