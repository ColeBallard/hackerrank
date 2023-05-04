import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        if (a.length() != b.length()) {
            return false;
        }
        
        char[] charArr = a.toCharArray();
        
        for (char c : charArr) {
            int i = b.indexOf(c);
            
            if (i == -1) {
                return false;
            }
            
            b = b.substring(0, i) + b.substring(i + 1);
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
