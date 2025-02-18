public class BubbleSortmodified {

  public static void main(String[] args) {
    int[] array = {4, 1, 6, 5, 9};
    int[] sortedArray = sortOptimized(array);
    
    System.out.println("Sorted array:");
    for (int num : sortedArray) {
      System.out.print(num + " ");
    }
  }

  public static int[] sortOptimized(int[] array) {
    var isSorted = false;
    var counter = 0;

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1 - counter; i++) {
        if (array[i] > array[i + 1]) {
          swapElements(array, i, i + 1);
          isSorted = false;
        }
      }

      counter++;
 }
    return array;
  }

  private static void swapElements(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j]=temp;
}
}
