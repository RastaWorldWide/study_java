package lr2.example6;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(20, 50);
        System.out.println("Длина прямоугольника: " + rectangle.getHeight());
        System.out.println("Ширина прямоугольника: " + rectangle.getWidth());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
    }
}


