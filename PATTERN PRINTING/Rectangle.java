import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        int rows,cols;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS:");
        rows=in.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS:");
        cols=in.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
