import java.util.*;
class MyThread implements Runnable{
    class Counter{
        int count=0;
         synchronized void increment(){
            count++;
        }
    }
    Counter c=new Counter();
    public void run(){
        
        for(int i=0;i<10;i++){
            c.increment();
            
        }
        System.out.println("Final Count: "+c.count);
    }
}
public class SynchronizationDemo {
    public static void main(String ars[]) throws InterruptedException{
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();t2.start();t1.join();t2.join();
        System.out.println("Main Thread Ended!");
    }
    
}
