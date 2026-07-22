import java .util.Scanner;
public class Negative {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the Array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The negative elements are:");
        for(int i=0;i<n;i++){
        if(arr[i]<0)
            System.out.println(arr[i]);
        
        }
        
        }
    }
    
    
