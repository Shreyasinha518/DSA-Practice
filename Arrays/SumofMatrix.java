import java.util.*;
public class SumofMatrix {
    public static int[][] summ(int arr1[][],int n,int m,int arr2[][]){
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                arr1[i][j]+=arr2[i][j];
            }
        }
    
    return arr1;

        }
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int n;int m;
            System.out.println("enter the number of rows");
            n=in.nextInt();
            System.out.println("enter the no of columns");
            m=in.nextInt();
            
        int arr1[][]=new int[n][m];
        
        System.out.print("enter the elemets to the matrix1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            
            
            arr1[i][j]=in.nextInt();
        }
        }
        int a;int b;
            System.out.println("enter the number of rows");
            a=in.nextInt();
            System.out.println("enter the no of columns");
            b=in.nextInt();
        int arr2[][]=new int[a][b];
        System.out.print("enter the elemets to the matrix2:");
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            
            
            arr2[i][j]=in.nextInt();
        }
        }
        int result[][]=summ(arr1,n,m,arr2);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]);
            }
        
        System.out.println();
    }
}
}

    

    
    

