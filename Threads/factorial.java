import java.util.*;
class MyThread implements Runnable  {
    String name;
    int n;
    MyThread(String name,int n){
        this.name=name;
        this.n=n;

    }
    public void run(){
        System.out.println(name+" Thread: Started");
        long fact=1;
        for(long i=1;i<=n;i++){
            fact=fact*i;
            

        }
        System.out.println(name+" Thread: "+fact);

        System.out.println(name+" Thread: Ended");
    }

    
}
public class factorial{
    public static void main(String args[]){
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       
        MyThread t1=new MyThread("Factorial",n);
        Thread th1=new Thread(t1);
        System.out.println("Main Thread: Started");
        th1.start();
        System.out.println("Main Thread: Ended");
    }
}
