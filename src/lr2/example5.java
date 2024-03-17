package lr2;

class Rectangle{
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

    public int getPerimetr(){
        return 2 * (height + width);
    }

    public int getArea(){
        return height * width;
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(20, 50);
        System.out.println("Длина квадрата: " + rectangle.getHeight());
        System.out.println("Ширина квадрата: " + rectangle.getWidth());
        System.out.println("Периметр квадрата: " + rectangle.getPerimetr());
        System.out.println("Площадь квадрата: " + rectangle.getArea());
    }

}


