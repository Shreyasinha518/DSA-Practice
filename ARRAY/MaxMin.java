import java .util.Scanner;
public class MaxMin{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the Array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The Maximum and Minimum Array elements are::");
        
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
           
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
    //int max=INTEGER MIN_VALUE;
    //int min=INTEGER MAX_VALUE;

    
}
