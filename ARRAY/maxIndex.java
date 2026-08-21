import java.util.Scanner;

public class maxIndex {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in array:");

        

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
           
        }

        int count = 0;
        int i;
        //int index=0;
        int max=arr[0];
        for ( i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (count == 0) {
            System.out.println(x + " is present at index " + i);
        } else {
            System.out.println(" , " + i);
        }
                
                count++;
                
                
            }

           if(arr[i]>arr[0]){
            max=arr[i];
           
           }
            
        }
        System.out.println(" "+x+" is found "+count +" times ");
        System.out.println("The maximum number in array is "+max);
        in.close();
    }
}
 
