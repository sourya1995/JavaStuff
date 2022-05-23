public class isPalindrome {
      public static boolean isPalindrome(String str) {
          int n = str.length();
          for (int i = 0; i < n/2; i++) {
              if(str.charAt(i) != str.charAt(n - i - 1)) {
                  return false;
              }
          }
          return true;
      }

      public static boolean isPalindromeV2(String str) {
          return str.equals(new StringBuilder(str).reverse().toString());
      }
}
