import java.util.*;
class Stack{
    int [] arr;
    int top;
    int size;
    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;

    }
    boolean isFull(){
        return top==size-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int x){
        if (!isFull()){
            arr[++top]=x;
        }
    }
    int pop(){
        if(!isEmpty()){
            return arr[top--];
        }
          return -1;
    }
    int peek(){
        if(!isEmpty()){
            return arr[top];
        }
          return -1;
    }
  

}


public class stackArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements in Stack:");
        int size=in.nextInt();
        int []arr;
        Stack s=new Stack(size);
        for(int i=0;i<size;i++){
           s.push(in.nextInt());
            
        }
        
           System.out.printf("%d\n",s.peek());
            
        
        for(int i=0;i<size;i++){
           System.out.printf("%d ",s.pop());
          
            
        }
        
       in.close();


    }
    
}
