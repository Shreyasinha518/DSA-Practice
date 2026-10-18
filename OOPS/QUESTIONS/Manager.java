import java.util.*;
public class Manager{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> RegistrationsID=new ArrayList<>();
        for(int i=0;i<n;i++){
            RegistrationsID.add(in.nextInt());
        }
        ArrayList<Integer> CancellationID=new ArrayList<>();
        for(int i=0;i<n;i++){
            CancellationID.add(in.nextInt());
        }
        Iterator<Integer> itr=RegistrationsID.iterator();
        while(itr.hasNext()){
            int ID=itr.next();
            if(CancellationID.contains(ID)){
                System.out.println("ID: "+ID+" is cancelled");
                itr.remove();
            }
            else{
                System.out.println("ID: "+ID+" is not cancelled");
            }


        }
        Collections.sort(RegistrationsID);
        System.out.println("Sorted Registration IDs:");
        for(int ele:RegistrationsID){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Size of the list:"+RegistrationsID.size());
        in.close();
    }
}
