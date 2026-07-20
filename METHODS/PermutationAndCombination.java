import java.util.Scanner;

public class PermutationAndCombination {
    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System .in);
        System.out.println("Enter the value of n and r");
        int n=in.nextInt();
        int r=in.nextInt();
        double permutation=(factorial(n))/factorial(n-r);
        double combination=(factorial(n))/(factorial(r)*factorial(n-r));

        System.out.println("Permutation: " + permutation);
        System.out.println("Combination: " + combination);
    }
    
}
