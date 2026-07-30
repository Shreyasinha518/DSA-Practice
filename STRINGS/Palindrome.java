import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int n=str.length();
        int x=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))
                x=1;
            i++;
            j--;
        }
        if(x==1){
            System.out.println("NOT A PALINDRME");
        }else{
        System.out.println("IT A PALINDRME");
        
    }
    
}
}
