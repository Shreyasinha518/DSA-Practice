//package OOPS;
class Students{
        String name;  //null
        private int rno=120;//0
        double cgpa;//0.0
        void print(){
            System.out.println(name+ "  " +rno+"  "+cgpa+"  ");
        }

    }
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1=new Students();
        System.out.println(s1.cgpa);   //default value
        s1.cgpa=9.9;
        s1.name="Shreya";
        s1.print();
        Students s2=new Students();   //Roll number is set in private
        s2.print();

        
    }
    

    
}
