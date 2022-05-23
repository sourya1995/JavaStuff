import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String testString = "I love code";
        CountVowelsAndConsonants counter = new CountVowelsAndConsonants();
        Map<Integer, Integer> counterResult = counter.countVowelsAndConsonants(testString);
        System.out.println(counterResult);

    }
}
