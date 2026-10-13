class Shape{
    String name;

    public Shape(String name){
        this.name = name;
    }

    public void area(){
        System.out.println(0.0);
    }
}

class Circle extends Shape{
    double radius;

    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public void area(){
        System.out.println(Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String name,double width,double height){
        super(name);
        this.height = height;
        this.width = width;
    }
    @Override
    public void area(){
        System.out.println(width * height);
    }
}




public class OOPtest{
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("MyCircle", 5),new Rectangle("Myrect", 4, 6)};

        for (Shape shape : shapes){
            shape.area();
        }
    }
}