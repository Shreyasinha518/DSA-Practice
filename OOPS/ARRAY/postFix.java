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
public class postFix {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        String exp;
        System.out.println("Enter the postfix expression:");
        exp=in.nextLine();
        String [] tokens=exp.split(" ");
        
        Stack s=new Stack(tokens.length);
        for (String token:tokens){
            switch (token) {
                case "+":
                    int a=s.pop();
                    int b=s.pop();
                    s.push(b + a);
                    break;
                case "-":
                    a=s.pop();
                    b=s.pop();
                    s.push(b - a);
                    break;
                case "*":
                    a=s.pop();
                    b=s.pop();
                    s.push(b * a);
                    break;
                case "/":
                    a=s.pop();
                    b=s.pop();
                    s.push(b / a);
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
