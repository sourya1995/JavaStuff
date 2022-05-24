public class hasOnlySubstrings {
    public static boolean doesItHaveOnlySubstrings(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));
            String resultStr = str.replaceAll(sb.toString(), "");
            if(resultStr.length() == 0) {
                return true;
            }

        }
        return false;
    }
}
