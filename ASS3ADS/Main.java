public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        for (int i = 0; i < 10000; i++) {
            table.put(
                new MyTestingClass(i, "Name" + i),
                new String("Student" + i)
            );
        }


        for (int i = 0; i < 11; i++) {
            System.out.println("Bucket " + i + ": " + table.getBucketSize(i));
        }

        BST<Integer, String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");

        for (var elem : tree.iterator()) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
}
    }
}
