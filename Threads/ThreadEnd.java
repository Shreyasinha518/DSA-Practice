import java.util.*;
class MyThread implements Runnable{
    public void run(){
        System.out.println("THE THREAD IS RUNNING!!!!....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}public class ThreadEnd{
    public static void main(String args[]){
        MyThread t1=new MyThread();
        Thread th1=new Thread(t1);
        System.out.println("Before Start: "+th1.isAlive());
        th1.start();
        System.out.println("After Start: "+th1.isAlive());
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Finish: "+th1.isAlive());
    }
}