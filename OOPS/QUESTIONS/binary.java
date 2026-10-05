import java.util.*;
public class binary{
public static void main(String argd[]){
    Scanner in=new Scanner(System.in);
    ArrayList< Integer> list=new ArrayList<>();
    System.out.println("Enter the size of the array");
    int n= in.nextInt();
    System.out.println("Enter elements");
    for(int i=0;i<n;i++){
        list.add(in.nextInt());

    }
    Collections.sort(list);
    System.out.println("Sorted list:");
    /*for (int ele:list){
        System.out.println(ele+" ");
    }*/
    Iterator <Integer> itr=list.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+" ");
        
    }
    System.out.println();
    System.out.println("Enter the element to be searched:");
    int key=in.nextInt();
    int index=Collections.binarySearch(list, key);
    if(index>=0){
        System.out.println("ELEMENTS IS FOUND AT INDEX: "+index);

    }
    else{
        System.out.println("ELEMENT NOT FOUND!!!!");
    }
}
}




