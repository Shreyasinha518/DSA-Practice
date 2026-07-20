
public class Call {
    public static int value() {
        System.out.println("This calls value");
        return 100;
        
    }
public static void main(String[] args) {
    int x=value();
    System.out.println("Value is:"+(100+x));
    
}

    
}
