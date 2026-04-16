import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    int n;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    n=in.nextInt();
    int fact=1;
    for(int i=n;i>1;i--){
        fact=fact*i;
    }
    

System.out.println("FACTORIAL OF NUMBER IS : "+fact);
}
}

    
