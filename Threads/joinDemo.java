import java.util.*;
class MyThread implements Runnable{
    public void run(){
       
            System.out.println(Thread.currentThread().getName()+" is running");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException exc){
                System.out.println("Thread Interrupted!");
            }
            System.out.println(Thread.currentThread().getName()+" is exiting");
        
    }
}
/**
 * joinDemo
 */
public class joinDemo {
    public static void main(String args[]) throws InterruptedException{
        MyThread mt=new MyThread();
        MyThread mt1=new MyThread();
        Thread t1=new Thread(mt);
        Thread t2=new Thread(mt1);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    
   System.out.println("Main Thread Ended!");
    
}
}
