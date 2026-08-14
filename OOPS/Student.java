package OOPS;

import java.util.Scanner;

class Input {
    String name;
    int rno;
    double cgpa;
}

public class Student {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Input s = new Input();

        System.out.print("Enter name: ");
        s.name = in.nextLine();

        System.out.print("Enter roll no: ");
        s.rno = in.nextInt();

        System.out.print("Enter CGPA: ");
        s.cgpa = in.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("NAME = " + s.name);
        System.out.println("ROLL NO = " + s.rno);
        System.out.println("CGPA = " + s.cgpa);

        in.close();
    }
}