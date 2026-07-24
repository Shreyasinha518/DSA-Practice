import java.util.ArrayList;
import java.util.Collections;
public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(5);
        arr.add(18);
        arr.add(10);
       
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        
        System.out.println(arr.get(2));//arr[2]
        arr.set(3,50);//arr[3]=50
        System.out.println(arr);
        arr.add(78);
        System.out.println(arr);
        arr.add(1,100);//arr[1]=100;
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        //Collections.reverse(arr);
        //System.out.println(arr);
        //Normal reverse:
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
        ArrayList<Character> arr1=new ArrayList<>();
        arr1.add('a');
        arr1.add('b');
        arr1.add('c');  
        System.out.println(arr1);

    }

    
}
