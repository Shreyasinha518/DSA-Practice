
public class compare {

    public static int compareTo(String str1, String str2) {
        int count = 0;
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            count++;   // One comparison made

            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println("Number of comparisons = " + count);
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        System.out.println("Number of comparisons = " + count);
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        String str1 = "Shreya Sinha";
        String str2 = "Shruti Sinha";

        int x = compareTo(str1, str2);

        if (x == 0) {
            System.out.println("Strings are equal");
        } else if (x < 0) {
            System.out.println("str1 comes before str2");
        } else {
            System.out.println("str1 comes after str2");
        }
    }
}