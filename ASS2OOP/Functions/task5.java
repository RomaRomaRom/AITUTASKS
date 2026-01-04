public class task5 {
    public static void main(String[] args) {
    int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);
    }
    public static void reverseArray(int[] array) {
    int counter = 0;
    for (int i = array.length-1; i >= array.length/2; i--) {
        int temp = array[counter];
        array[counter] = array[i];
        array[i] = temp;
        counter ++;
    }
    }
    public static void printArray(int[] array) {
    for (int i : array) {
    System.out.print(i + ", ");
    }
    System.out.println();
 }
}
