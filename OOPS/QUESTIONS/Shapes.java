import java.util.*;

abstract class Shape {
    double area;

    abstract void calculateArea();
    abstract void display();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }

    void display() {
        System.out.printf("Circle(%.2f) Area: %.2f%n", radius, area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    void calculateArea() {
        area = length * width;
    }

    void display() {
        System.out.printf("Rectangle(%.2f,%.2f) Area: %.1f%n",
                length, width, area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        calculateArea();
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }

    void display() {
        System.out.printf("Triangle(%.2f,%.2f) Area: %.1f%n",
                base, height, area);
    }
}

public class Shapes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<>();

        while(sc.hasNextInt()){
            int type=sc.nextInt();
            if(type==0){
                break;

            }
            switch(type){
                case 1:
                    shapes.add(new Circle(sc.nextDouble()));
                    break;
                case 2:
                    shapes.add(new Rectangle(sc.nextDouble(),sc.nextDouble()));
                    break;
                case 3:
                    shapes.add(new Triangle(sc.nextDouble(),sc.nextDouble()));
                    break;
                    default:
                        System.out.println("INVALID INPUT");
                    
            }

            }
            //Sorting
            Collections.sort(shapes,new Comparator<Shape>(){
                public int compare(Shape s1,Shape s2){
                    return Double.compare(s1.area, s2.area);
                }
            });
            for (int i=0;i<shapes.size();i++){
                System.out.print(i+": ");
                shapes.get(i).display();

            }
            sc.close();
        }
    }
