import java.util.*;
public class Transpose {
    public static int[][] tran(int arr[][],int brr[][],int n,int m){
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                brr[i][j]=arr[j][i];

                
            
            }
        }
    
    return brr;

        }
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int n;int m;
            System.out.println("enter the number of rows");
            n=in.nextInt();
            System.out.println("enter the no of columns");
            m=in.nextInt();
            
        int arr[][]=new int[n][m];
        int brr[][]=new int[m][n];
        
        System.out.print("enter the elemets to the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            
            
            arr[i][j]=in.nextInt();
            

        }
        System.out.println();

        }
        
    

        
        
        
        
            
        int transpose[][]=tran(arr,brr,n,m);

        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                
                System.out.print(transpose[i][j]+" ");
            }
        
        System.out.println();
    }
}
}



    

    
    


