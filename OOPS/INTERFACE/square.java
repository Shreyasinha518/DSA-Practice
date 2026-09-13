import java.util.*;
interface Number{
    int findSqr(int i);
}
class A implements Number{
    public int findSqr(int i){
        return i*i;
    }
}
public class square{
    public static void main(String args[]){
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value:");
        int i=in.nextInt();
        A a=new A();
        System.out.println(a.findSqr(i));

    }
}