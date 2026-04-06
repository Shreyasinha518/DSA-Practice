import java.util.Scanner;
public class PositiveInteger {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num;
        System.out.println("ENTER A NUMBER");
        num=in.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("NUMBER IS DIVISIBLE BY BOTH 5 & 3");}
            else if(num%5==0){
            System.out.println("NUMBER IS DIVISIBLE BY 5");
        }
        else if (num%3==0){
            System.out.println("NUMBER IS DIVISIBLE BY 3");}
        
            else{
                System.out.println("NUMBER IS NOT DIVISIBLE BY 5 OR 3");
            }

        }

    }
    

