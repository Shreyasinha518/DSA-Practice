import java.util.Scanner;
public class TwoPointer0and1 {
    public static void swap(int[] arr,int i,int j){
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
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            } else if(arr[i]==0){
                i++;
            } else if(arr[j]==1){
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

        
    }
    }
    


