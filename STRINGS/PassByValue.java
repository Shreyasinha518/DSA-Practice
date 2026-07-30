import java.util.Scanner;
public class PassByValue {
    public static void change(String x){
        x="HELLO";

    }
    public static void main(String[] args) {
        String x;
        x="WORLD";
        System.out.println(x);    
        change(x);
        System.out.println(x);      //NO CHANGE
    }
    
}
