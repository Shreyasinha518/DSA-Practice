import java.util.Scanner;
public class SecondLargest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<max&&arr[i]>secondlargest){
                secondlargest=arr[i];


            }
        }
            System.out.println("Second Largest element is : " + secondlargest);
        }
       }
        
    
    
