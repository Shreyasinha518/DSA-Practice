import java .util.Scanner;
//package OOPS;
class Students{
        String name;  //null
        private int rno=120;//0
        double cgpa;//0.0
        void print(){
            System.out.println(name+ "  " +rno+"  "+cgpa+"  ");
        }
        int getRno(){   //getter
            return rno;
        }
        void setRno(int x){    //setter
            rno=x;
        }

    }
public class PrivateKeyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Students s1=new Students();
        System.out.println(s1.cgpa);   //default value
        s1.cgpa=9.9;
        s1.name="Shreya";
        s1.print();
        Students s2=new Students();   //Roll number is set in private
        s2.print();
        s1.setRno(100);   //yaha pe rno even being private change hogya 
        System.out.println(s1.getRno());//yaha we got the rollno of object 1

        StringBuilder sb=new StringBuilder(sc.nextLine());  //String builder ka concept hai ki how we can take the input in string itself
        System.out.println(sb);

        
    }
    

    
}
