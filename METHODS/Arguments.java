//import java.utiL.Scanner;
public class Arguments {
    public static int max(int a,int b,int c){
        if(a>b&&a>c)
        return a;
        else if(b>c)
            return b;
        else
            return c;
    }
    public static void main(String[] args) {
        int result = max(100,2000,300);
        System.out.println("Maximum is:" + result);
    }
}


