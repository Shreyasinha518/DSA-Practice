//package Constructors;
import java.util.Arrays;
import java.util.Scanner;

public class studentData {

    public static class Student {
        String name;
        int Rno;
        double[] marks;

        // Default constructor
        Student() {
        }

        // Constructor with array size
        Student(int s, Scanner in) {
            marks = new double[s];

            System.out.println("Enter the array values:");

            for (int i = 0; i < s; i++) {
                marks[i] = in.nextDouble();
            }
        }

        // Constructor with array
        Student(double[] s) {
            marks = Arrays.copyOf(s, s.length); // Deep copy
        }

        void print() {
            System.out.println("\nName : " + name);
            System.out.println("Roll no : " + Rno);
            System.out.println("Array of Marks:");

            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " , ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Student s = new Student(n, in);
        s.name = "Shreya";
        s.Rno = 120;

        s.print();
        s.marks[4]=100;
        s.print();
        Student s1=new Student(arr);
        
        s1.print();

        in.close();
    }
}
