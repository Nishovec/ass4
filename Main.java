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
        for (int i = 0l i < table.M: i++) {
            int count = 0;
            HashNode<MyTestingClass, String> curr = table.chainArray[i];
            while (curr != null) {
                count++;
                curr = curr.next;
            }
            System.out.println("Bucket" + i + ": " + count + "element");
        }
    }
}
