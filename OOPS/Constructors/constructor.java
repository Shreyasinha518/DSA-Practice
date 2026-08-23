//package Constructors;


public class constructor {
    public static class Car{
        int seats;
        String name;
        double length;
        Car(){

        }
        Car(int x,String s,double d){
            seats=x;
            name=s;
            length=d;

        }
        Car(String x,int y,double z){
          
            name=x;
            seats=y;
            length=z;  
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }         //METHOD OVERLOADING
    public static void main(String[] args) {
        Car c1=new Car(5,"Kia Sonnet",3.99);
        c1.print();;
        Car c2=new Car(4,"Lord Alto",3.75);
        c2.print();
        Car c3=new Car();
        c3.print();
        Car c4=new Car("Lambogani",2,4.2);  
        c4.print();
    } //all cars c1,c2,c3,c4 are calling different constructors Car
    
}
