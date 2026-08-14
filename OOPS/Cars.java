//package OOPS;
public class Cars {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){                 //class can be methods also
            System.out.println(seats+"  "+name+"  "+length+"m  "+type+"  "+torque+"Nm  ");
        }
        
    }
    public static void main(String[] args) {
        Car c =new Car();
        c.seats=100;
        c.length=200;
        c.name="Jaguar";
        c.torque=80;
        c.type="speed";
        c.print();
        change (c);   //pass by reference
        c.print();
        

    
    }
    public static void change(Car x){
        x.seats=4;


    }
    
}
