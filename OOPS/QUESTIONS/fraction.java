import java.util.*;
class frac{
    int num;
    int den;
    frac(int num,int den){
        this.num=num;
        this.den=den;
    }
    void print(){
        System.out.println("Fraction: "+num+"/"+den);
    }
    void add(frac c){
        int numerator=this.num*c.den+c.num*this.den;
        int denominator=this.den*c.den;
        System.out.println("Sum of fractions: "+numerator+"/"+denominator);
    }
    void sub(frac c){
        int numerator=this.num*c.den-c.num*this.den;
        int denominator=this.den*c.den;
        System.out.println("Difference of fractions: "+numerator+"/"+denominator);
    }
    void multiply(frac c){
        int numerator=this.num*c.num;
        int denominator=this.den*c.den;
        System.out.println("Product of fractions: "+numerator+"/"+denominator);
    }
    void divide(frac c){
        int numerator=this.num*c.den;
        int denominator=this.den*c.num;
        System.out.println("Quotient of fractions: "+numerator+"/"+denominator);
    }
}
public class fraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator and denominator of fraction1:");
        int num1=sc.nextInt();
        int den1=sc.nextInt();
        frac f1=new frac(num1,den1);
        System.out.println("Enter numerator and denominator of fraction2:");
        int num2=sc.nextInt();
        int den2=sc.nextInt();
        frac f2=new frac(num2,den2);
        f1.print();
        f2.print();
        f1.add(f2);
        f1.sub(f2); 
        f1.multiply(f2);
        f1.divide(f2);
    }
    
}
