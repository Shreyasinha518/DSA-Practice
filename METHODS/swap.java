
public class Swap {
    public static void swapTwoNumbers(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
public static void main(String[] args) {
    System.out.println("Before swapping: a=5, b=10");
    int a=5, b=10;
    swapTwoNumbers(a, b);
    System.out.println("After swapping: a=" + a + ", b=" + b);
}
    
}   
//PASS BY VALUE
//yaha sirf value pass hota hai thus change in function is stored in another box and thus the original value is not changed.
