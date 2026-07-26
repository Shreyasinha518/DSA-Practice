import java.util.Scanner;
public class MergeTwoSortedArray {
    public static void merge(int[] c,int[] a,int[]b){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];

            }else{
                c[k++]=b[j++];}

        }
        if(i==a.length){
            while(j<b.length){
            c[k++]=b[j++];
            }
        }
        if(j==b.length){
            while(i<a.length){
            c[k++]=a[i++];
            }
           
        }
    }
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of 1st the array: ");
        int n1 = in.nextInt();
        System.out.print("Enter the size of 2nd the array: ");
        int n2 = in.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = in.nextInt();
        }
        
        int c[]=new int[n1+n2];
        for(int ele: c)System.out.print(ele+" ");
        System.out.println();
        merge(c, a, b);
        for(int ele: c)System.out.print(ele+" ");
        System.out.println();


        
}
    }

