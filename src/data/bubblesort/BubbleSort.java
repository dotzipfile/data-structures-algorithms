package data.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 9, 3, 0, 1, 5};

        System.out.print("Pre sort: ");
        printArray(array);

        sort(array);

        System.out.print("Post sort: ");
        printArray(array);
    }

    private static void sort(int[] array) {
        int loopEnd = array.length - 1;

        for (int i = 0; i < loopEnd; i ++) {
            for (int j = 0; j < loopEnd - i; j ++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(i);
        }
        System.out.print("\n");
    }
}
