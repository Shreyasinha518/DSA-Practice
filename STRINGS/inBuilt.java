
public class inBuilt {
    public static void main(String[] args) {
        String str="Shreya Sinha";
        String str1="Shruti Sinha";
        System.out.println(str.length());
        System.out.println(str.indexOf('i'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.substring(2, 8));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        if((str.contains("eya"))&&(str.startsWith("Shr"))){
            System.out.println("HAPPY");
        }
        System.out.println(str1.compareTo(str));
    
        str=str.concat(" "+str1);
        System.out.println(str);
}
}
