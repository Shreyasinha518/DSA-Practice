import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("ENTER A NUMBER:");
        num=in.nextInt();
        if(num>=0)
            System.out.println("ABSOLUTE NUMBER IS :"+num);
        else 
            System.out.println("ABSOLUTE NUMNER IS:"+(-1)*num);
        /*if(num<0) num=-num;
        System.out.println(num);*/

    }

    
}
