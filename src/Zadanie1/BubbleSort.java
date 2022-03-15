package Zadanie1;

class BubbleSort {
    public static void main(String[] args) {
        Sortable sortBubble = new Sortable() {
            @Override
            public void sort(int[] array) {
                int n = array.length;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                        if (array[j] < array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
            }
            public void printArray(int[] array) {
                int n = array.length;
                for (int i=0; i<n; ++i)
                    System.out.print(array[i] + " ");
                System.out.println();
            }
        };
        int[] array = {5, 10, -8, -23, 1009, 2938, 153, 24, -1000, 1412, -494230235};
        sortBubble.sort(array);
        System.out.println("Sorted array");
        sortBubble.printArray(array);
    }
}
