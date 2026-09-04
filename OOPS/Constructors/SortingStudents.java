import java.util.Scanner;

public class SortingStudents {

    static class Student {
        String name;
        int rollNo;
        int[] marks;

        Student(String name, int rollNo, int[] marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        int totalMarks() {
            int total = 0;

            for (int mark : marks) {
                total += mark;
            }

            return total;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = in.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = in.nextInt();
        in.nextLine();

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.print("Enter name: ");
            String name = in.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = in.nextInt();

            int[] marks = new int[subjects];

            System.out.println("Enter marks:");

            for (int j = 0; j < subjects; j++) {
                marks[j] = in.nextInt();
            }

            in.nextLine();

            students[i] = new Student(name, rollNo, marks);
        }

        // Sort by total marks (ascending)
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (students[i].totalMarks() > students[j].totalMarks()) {

                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // Display sorted students
        System.out.println("\nStudent details sorted by total marks:");

        for (int i = 0; i < n; i++) {

            System.out.println(
                "Name: " + students[i].name +
                ", Roll No: " + students[i].rollNo +
                ", Total Marks: " + students[i].totalMarks()
            );
        }

        in.close();
    }
}