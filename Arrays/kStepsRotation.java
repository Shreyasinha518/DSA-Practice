import java.util.*;
public class kStepsRotation {
    public static void reverse(int arr[],int a,int b){
        int i=a;
        int j=b;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;


        }
    
    return;

        }
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int n;int k;
            System.out.println("enter the number of elements:");
            n=in.nextInt();
            System.out.println("enter the no of rotations:");
            k=in.nextInt();
            if(k>n)
            k=k%n;
        int arr[]=new int[n];
        System.out.print("enter the elemets to the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("the rotated array"+" ");
        reverse (arr,0,n-1);
        reverse (arr,0,k-1);
        reverse (arr,k,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
        


            
        }
    

    
    

