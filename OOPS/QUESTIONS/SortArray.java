import java.util.Arrays;
import java.util.Scanner;
public class SortArray{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextDouble();

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");

        }
        System.out.println();

        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            System.out.printf("%.2f ",arr[i]);
        }

    }

}