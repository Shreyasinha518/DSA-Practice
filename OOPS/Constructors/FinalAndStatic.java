class Cricketer{
    final String country="India";
    static int totalPlayers;

}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        System.out.println(c1.country);
        c1.totalPlayers=11;
        //c1.country = "USA"; // This line will cause a compilation error because 'country' is final and cannot be reassigned.
       
        System.out.println("Total Players: " + c2.totalPlayers);
    }
    
}
