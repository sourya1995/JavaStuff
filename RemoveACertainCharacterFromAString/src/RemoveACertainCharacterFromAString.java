public class RemoveACertainCharacterFromAString {
    public static String removeCharacter(String str, char ch) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(ch != chArray[i]){
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}
