public class CountOccurrencesOfACertainCharacter {
    public static int countOccurrencesOfACertainCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }

        }
        return count;
    }
}
