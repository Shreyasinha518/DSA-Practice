
import java.util.*;
public class Reverse {
    public static void rev(int arr[]){
        int i=0;
        int j=arr.length-1;
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
            int n;
            System.out.println("enter the number of elements:");
            n=in.nextInt();
        int arr[]=new int[n];
        System.out.print("enter the elemets to the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("the reversed array is:"+" ");
        rev (arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
        


            
        }
    

    
    
