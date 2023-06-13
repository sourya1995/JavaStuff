public class first {
    int i;
    void display(){
        System.out.println(i);
    }
    class second extends first {
        int j;
        void display(){
            System.out.println(j);
        }
    }
    class inheritance{
        public static void main(String[] args) {
            {
                second obj = new second();
                obj.1 = 1;
                obj.2 = 2;
                obj.display();
            }
        }
    }
}
