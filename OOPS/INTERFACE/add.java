import java.util.*;


public class add {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        int n;
        String s;
        try {
            n=in.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                
                sum=sum+in.nextInt();}
                System.out.println(sum);
            }
        


        
        catch (InputMismatchException e){
            s=in.nextLine();
            System.out.println("ERROR");
        }
        in.close();
    }


    
}
