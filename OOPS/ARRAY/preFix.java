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
public class preFix {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        String exp;
        System.out.println("Enter the prefix expression:");
        exp=in.nextLine();
        String [] tokens=exp.split(" ");
        
        Stack s=new Stack(tokens.length);
        for (int i=tokens.length-1;i>=0;i--){
            String token=tokens[i];
            switch (token) {
                case "+":
                    int a=s.pop();
                    int b=s.pop();
                    s.push(a + b);
                    break;
                case "-":
                    a=s.pop();
                    b=s.pop();
                    s.push(a - b);
                    break;
                case "*":
                    a=s.pop();
                    b=s.pop();
                    s.push(a * b);
                    break;
                case "/":
                    a=s.pop();
                    b=s.pop();
                    s.push(a / b);
                    break;
                default:
                    s.push(Integer.parseInt(token));
                    break;

            }
        }
        System.out.println(s.pop());
        in.close();


    }

    
}

