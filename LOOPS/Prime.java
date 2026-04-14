import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int n;
        boolean flag=true;
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n=in.nextInt();
        for(int i=2;i<Math.sqrt(n);i++){            //i<=n-1
            if(n%i==0){                             //USING MATH FUCTION DECREASES THE TIME COMPLEXITY
                flag=false;
                break;
            }
        }
            if(n==1)System.out.println("NEITHER PRIME NOR COMPOSITE");
            else if (flag==false)System.out.println(n+" IS COMPOSITE NUMBER");
            else System.out.println(n+" IS PRIME NUMBER");
        }
            

        }
    
    

