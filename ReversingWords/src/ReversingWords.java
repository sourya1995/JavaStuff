public class ReversingWords {
    public static final String WHITESPACE = " ";

    public String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for(String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1 ; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }

            reversedString.append(reversedWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

}
