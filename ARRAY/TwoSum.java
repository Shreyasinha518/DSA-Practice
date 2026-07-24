import java.util.Scanner;
public class TwoSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target;
        System.out.println("Enter the target element:");
        target = in.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The pair is: "+arr[i]+" and "+arr[j]);
                }
            }
        }

        
       
    }
    
}
