import java.util.*;
class MyThread implements Runnable{
    Thread thr;
    int result;
    int[] list;
    private int sum;
    MyThread(String name,int[] sums){
       
        thr=new Thread(this,name);
        list=sums;
        thr.start();
    }
    public void run(){
        result=0;
        for(int val:list){
            result=result+val;
        }
       
    }
    public int getSum(){
        return result;
    }
    

}
public class Adding{
    public static void main(String args[]){
         Scanner in = new Scanner(System.in);

System.out.println("Enter number of elements:");
int n = in.nextInt();

int[] arr = new int[n];

System.out.println("Enter numbers:");

for(int i = 0; i < n; i++) {
    arr[i] = in.nextInt();
}
        
        MyThread t1=new MyThread("C1",arr);
        MyThread t2=new MyThread("C2",arr);
        try{
            t1.thr.join();
            t2.thr.join();

        }
        catch(InterruptedException exc){
            System.out.println("Main Thread Interrupted!");
        }
        System.out.println(t1.thr.getName()+": "+t1.getSum());
        System.out.println(t2.thr.getName()+": "+t2.getSum());



    }
}