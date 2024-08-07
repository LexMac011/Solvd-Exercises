class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[] {78, 32, 11, 27, 15, 7};

        SelectionSort.selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] selectionSort(int[] array) {
  
        for (int i = 0; i < array.length; i++) {
           int min = i;
           // looking for the minumum value in the array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;                       
                }
            }
            // swapping the elements only when the first is smaller
            if (i != min) {
                int aux = array[min];
                array[min] = array[i];
                array[i] = aux;   
            }  
        }
        return array;
    }  
}