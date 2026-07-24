import java.util.Scanner;

public class Rotate {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
     public static void reverse(int arr[], int i, int j) {
         while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The original Array is:");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the value of d:");
        int d = in.nextInt();
        d=d%n;

        // Rotate the array to the left by d positions
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("The rotated Array is:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        }
    }

    

