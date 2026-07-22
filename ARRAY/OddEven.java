import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2==0)
            System.out.println(arr[i] + 10);
        else
            System.out.println(arr[i]*2);

        }

       
    }
    
}