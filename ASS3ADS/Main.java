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
    }
}
