import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        //String s="";
        //s += n;
        String s=Integer.toString(n);
        System.out.println(s);
        System.out.println("Count of integers:"+s.length());
    }
    
}
