package Task1;

public interface Shape {
    void calculateArea();
    void calculatePerimiter();
}
class Cirlce implements Shape{
    int radius;
    @Override
    public void calculatePerimiter() {
        double perimiter=radius*(Math.PI*2);
        System.out.println(perimiter);

    }

    @Override
    public void calculateArea() {
        double area=radius*Math.PI;
        System.out.println(area);

    }
}
class Square implements Shape{
    int width;
    int hieght;
    @Override
    public void calculateArea() {
        int area=width*hieght;
        System.out.println(area);
    }

    @Override
    public void calculatePerimiter() {
        int perimiter=(width*2)+(hieght*2);
        System.out.println(perimiter);
    }
}
class Main{
    public static void main(String[] args) {
        Square hw=new Square();
        hw.width=10;
        hw.hieght=10;
        hw.calculateArea();
        hw.calculatePerimiter();
        Cirlce hw1=new Cirlce();
        hw1.radius=10;
        hw1.calculateArea();
        hw1.calculatePerimiter();

    }
}
