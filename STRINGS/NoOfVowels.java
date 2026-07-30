import java.util.Scanner;
public class NoOfVowels {
    public static void main(String[] args) {
        
    
    Scanner in =new Scanner(System.in);
    String str=in.nextLine();
    int n=str.length();
    int count=0;
    for(int i=0;i<n;i++){
        char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            
            count++;
        }
    }
        System.out.println("The number of vowels are = "+count);
           
    
    
    
}
}
