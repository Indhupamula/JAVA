// JavaProblems/ValidPalindrome.java
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left=0, right=s.length()-1;
        while(left<right) {
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome: " + isPalindrome(s));
    }
}
