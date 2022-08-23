public class Parray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int intArray[] = {4, 8, 1, 9, 0};
        printArray(intArray);

        int intArray2[] = {-1, 200, -500, 45};
        printArray(intArray2);
    }
}
