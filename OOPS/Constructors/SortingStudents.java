import java.util.Scanner;

public class SortingStudents {

    public static class Student {
        String name;
        int rollNo;
        int marks[];

        Student(String name, int rollNo, int[] marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        // Calculate total marks
        int totalMarks() {
            int total = 0;

            for (int i = 0; i < marks.length; i++) {
                total += marks[i];
            }

            return total;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = in.nextInt();

        System.out.println("Enter number of subjects:");
        int subjects = in.nextInt();
        in.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the name:");
            String name = in.nextLine();

            System.out.println("Enter Roll Number:");
            int rollNo = in.nextInt();

            int[] marks = new int[subjects];

            System.out.println("Enter the subject marks:");

            for (int j = 0; j < subjects; j++) {
                marks[j] = in.nextInt();
            }

            in.nextLine();

            students[i] = new Student(name, rollNo, marks);
        }

        // Sort students by total marks
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (students[i].totalMarks() > students[j].totalMarks()) {

                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("Student details sorted by marks:");

        for (int i = 0; i < n; i++) {

            System.out.println(
                "Name: " + students[i].name +
                ", Roll No: " + students[i].rollNo +
                ", Total Marks: " + students[i].totalMarks()
            );
        }
    }
}
