import java.util.Scanner;
public class Search {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the element to be searched:");
        int searchElement = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        int i;
        for ( i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        boolean flag=false;

        
        for ( i = 0; i < n; i++) {
            if(arr[i]==searchElement){
                flag=true;
                break;
            }
        }
            if(flag) System.out.println("Element found at index: "+i);
            else System.out.println("Element not found in the array");
            
            
            }
            
        }
    
    
