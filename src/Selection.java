public class Selection {
    public static void selectionSort(int[] array){
    int n = array.length;
    for (int i = 0; i <= n - 1 ; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Array antes da ordenação:");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Array depois da ordenação:");
        printArray(array);
    }
}

