import java.util.Scanner;
public class CharDatatype {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        char letter='Z';
        System.out.println(letter);
        //ASCII VALUES    (typecasting)
        char ch='A';
        int x=(int)ch;
        System.out.println(x);
        char c='a';
        int y=c;
        System.out.println(y);
        char ch1='b';
        System.out.println(ch1+ch);
        System.out.println(ch1*ch);
        int z=99;
        char ch2=(char)z;
        System.out.println(ch2);
        int a=32;
        char ch3=(char)a;
        System.out.println(ch3);
    }
    
}
