import java .util.Scanner;
public class SumAndProduct {                   //LINEAR SEARCH
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the Array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       int sum=0;
       double product=1;
        for(int i=0;i<n;i++){
           sum=sum+arr[i];
           product=product*arr[i];
        }
        System.out.println("The Sum of Array: "+sum);
        System.out.println("The Product of Array: "+product);
    }
    
} 
    

