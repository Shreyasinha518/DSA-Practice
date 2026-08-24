import java.util.Scanner;
public class Sorting {
     public static class Student{
        String name;
        int rollNo;
        int marks[];
        Student(String name,int rollNo,int[] marks){
            this.name=name;
            this.rollNo=rollNo;
            this.marks=marks;
          

        }
        void Sort(int n,int []marks){
           for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (marks[i] > marks[j]) {
                int temp = marks[i];
                marks[i] = marks[j];
                marks[j] = temp;

                
            }
        }
    }
}
     }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            in.nextLine();
            System.out.println("Enter the name:");
            String name=in.nextLine();
            System.out.println("Enter Roll Number:");
            int rollNo=in.nextInt();
            int [] marks= new int[n];
            System.out.println("Enter the subject marks:");
            for(int i=0;i<n;i++){
                marks[i]=in.nextInt();
            }
            Student s=new Student(name,rollNo,marks);
            System.out.println("Student details:");
            s.Sort(n,marks);
            System.out.println("Student details sorted by marks:");
            for(int i=0;i<n;i++){
                System.out.print(marks[i]+" , ");
            }


        }
    }


    

