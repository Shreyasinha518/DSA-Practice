import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double cp,sp;
        System.out.println("ENTER THE COST PRICE");
        cp=in.nextDouble();
        System.out.println("ENTER THE SELLING PRICE");
        sp=in.nextDouble();
        if(sp>cp)
            System.out.println("PROFIT:"+(sp-cp)+"PROFIT PERCENTAGE:"+((sp-cp)/cp)*100);
        else if(cp>sp)
            System.out.println("LOSS:"+(cp-sp)+"PROFIT PERCENTAGE:"+((cp-sp)/sp)*100);
        else
            System.out.println("NO PROFIT NO LOSS");

    }
    
}
