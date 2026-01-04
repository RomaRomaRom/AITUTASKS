import java.util.Arrays;

public class task11 {
 public static void main(String[] args) {
 String[] memory = {"object15", null, null, "object2", null, null, null, null,
"object32", null, "object4"};
 executeDefragmentation(memory);
 System.out.println(Arrays.toString(memory));
 }

 
public static void executeDefragmentation(String[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - 1 - i; j++) {
            if (array[j] == null && array[j + 1] != null) {
                String temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

}
