import java.util.ArrayList;

public class ArrList2 {
    public static void main(String args[]) {
        ArrayList < Integer > values = new ArrayList< Integer >();
        values.add(3);
        values.add(2);
        values.add(1, 1);
        values.get(1);
        values.set(1, 2);
        values.add(3);
        values.remove(1);
        System.out.println(values);
    }
}
