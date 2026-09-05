//package OOPS.QUESTIONS;
import java.util.*;
class complex{
    int r;
    int i;
    complex(int r,int i){
        this.r=r;
        this.i=i;
    }
    void print(){
        if (i<0){
            System.out.println("Complex number: "+r+" - "+(-i)+"i");
        }
        else{

        
        System.out.println("Complex number: "+r+" + "+i+"i");
    }
}
void add(complex z){
    int real=this.r+z.r;
    int imag=this.i+z.i;
    if (imag<0){
        System.out.println("Sum of complex numbers: "+real+" - "+(-imag)+"i");
    }
    else{
    System.out.println("Sum of complex numbers: "+real+" + "+imag+"i");
}
}
void subtract(complex z){
    int real=this.r-z.r;
    int imag=this.i-z.i;
    if (imag<0){
        System.out.println("Difference of complex numbers: "+real+" - "+(-imag)+"i");
    }
    else{
    System.out.println("Difference of complex numbers: "+real+" + "+imag+"i");
}
}
void multiply(complex z){
    int real=this.r*z.r-this.i*z.i;
    int imag=this.r*z.i+this.i*z.r;
    if (imag<0){
        System.out.println("Product of complex numbers: "+real+" - "+(-imag)+"i");
    }
    else{
    System.out.println("Product of complex numbers: "+real+" + "+imag+"i");
}
}
void divide(complex z) {
    double denominator = (z.r * z.r) + (z.i * z.i);

    double real = (this.r * z.r + this.i * z.i) / denominator;
    double imag = (this.i * z.r - this.r * z.i) / denominator;

    if (imag < 0) {
        System.out.println("Quotient of complex numbers: "
                + real + " - " + (-imag) + "i");
    } else {
        System.out.println("Quotient of complex numbers: "
                + real + " + " + imag + "i");
    }
}
}

public class complexNumber {
    public static void main(String[] args) {
        complex z1=new complex(3,4);
        complex z2=new complex(5,-6);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.subtract(z2);
        z1.multiply(z2);
        z1.divide(z2);

    }

    
}

