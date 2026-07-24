import java.util.Scanner;

public class Reverse {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

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
        System.out.println("The reversed Array is:");
        int i=0;     //you can even swap a partictlar part by initializing number eg.i=2;j=5
        int j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        }
    }

    

