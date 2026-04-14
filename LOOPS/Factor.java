import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int n;
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n=in.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){            //i<=n-1
            if(n%i==0){  
                if(i==n/i){System.out.println(i);}
                else{               //USING MATH FUCTION DECREASES THE TIME COMPLEXITY
                System.out.println(i);
                System.out.println(n/i);
                }
                
                }
            }
        }
           
            

        }
    
    
    


