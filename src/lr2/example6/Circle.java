package lr2.example6;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args){
        Circle circle = new Circle(15);
        System.out.println("Радиус круга: " + circle.getRadius());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getPerimeter());
    }
}

