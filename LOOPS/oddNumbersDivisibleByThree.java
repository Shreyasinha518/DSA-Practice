import java.util.Scanner;
public class oddNumbersDivisibleByThree {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int n;
        System.out.println("ENTER THE NUMBER:");
        n=in.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0&&i%3==0){
                System.out.println("THE NUMBER "+ i +" IS AN ODD NUMBER WHIC IS DIVISIBLE BY 3");
            }
        }
    }
    
}
