import java .util.*;
public class twosum{
    public static void sum(int arr[],int x){
        
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                
                    System.out.println("The duplet whose sum is equalto the given number="+"("+arr[i]+","+arr[j]+")");
                    System.out.println("The indices are"+i+","+j);
                }
                
            }
        }
                
        
                    
                

        return;

    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n;int x;
        System.out.println("enter the size of array:");
        n=in.nextInt();
        System.out.println("enter the element to be matched:");
        x=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements to the array:");

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

            
        sum(arr,x);
        }


}

