import java.util.Scanner;

public class searchSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in array:");

        int firstSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            firstSum += arr[i];
        }

        int count = 0;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(x + " is not found");
            return;
        }

        // Create new array without x
        int[] arr2 = new int[n - count];

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr2[index] = arr[i];
                index++;
            }
        }

        int secondSum = 0;

        for (int i = 0; i < arr2.length; i++) {
            secondSum += arr2[i];
        }

        int difference = firstSum - secondSum;

        System.out.println("First array sum = " + firstSum);
        System.out.println("Remaining array sum = " + secondSum);
        System.out.println("Difference = " + difference);
        System.out.println(x + " is found");

        in.close();
    }
}
