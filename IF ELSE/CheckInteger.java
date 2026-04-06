import java.util.Scanner;
public class CheckInteger {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double num;
        System.out.println("ENTER A NUMBER");
        num=in.nextDouble();
        
        if(num==(int)num)
            System.out.println("THE NUMBER IS INTEGER");
        else
            System.out.println("THE NUMBER IS NOT AN INTEGER");




    }
    
}
