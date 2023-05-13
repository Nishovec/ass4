public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingcClass, String> table  = new MyHashTable<>();

        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int x = rand.nextInt(100);
            String y = Integer.toString(x);
            MyTestingClass key = new MyTestingClass(x, y);
            String value = "Value_" + Integer.toString(i);
            table.put(key, value);
        }
    }
}
