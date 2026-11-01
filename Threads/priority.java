import java.util.*;
class MyThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getPriority());
    }
}
    public class priority{
        public static void main(String args[]){
            MyThread obj=new MyThread();
            Thread t1=new Thread(obj);
            Thread t2=new Thread(obj);
            Thread t3=new Thread(obj);
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MAX_PRIORITY);
            t3.setPriority(Thread.NORM_PRIORITY);
            t1.start();
            t2.start();
            t3.start();

        }
    }

