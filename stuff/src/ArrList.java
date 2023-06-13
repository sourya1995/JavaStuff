import java.util.ArrayList;

public class ArrList {
    public static void main(String args[]) {
        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add(1);
        arr.add(3);
        arr.add(2, "C");
        System.out.println(arr);
    }
}
