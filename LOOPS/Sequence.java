import java.util.Scanner;
public class Sequence{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms :");
        n=in.nextInt();
        
        for(int i=1,j=n;i<=j;i++,j--){
            System.out.println(i);
            if(i!=j){
                System.out.println(j);
            }
           
                
            }
           

        }
    }


    
    

