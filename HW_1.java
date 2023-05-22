import java.util.Arrays;

public class HeapSort {
  
  public static void heapSort(int[] array) {
    int n = array.length;
   
    for (int i = n / 2 - 1; i >= 0; i--)
      heapify(array, n, i);
    
 
    for (int i = n - 1; i >= 0; i--) {
      
      int temp = array[0];
      array[0] = array[i];
      array[i] = temp;
      
    
      heapify(array, i, 0);
    }
  }
  
  public static void heapify(int[] array, int n, int i) {
    int largest = i; 
    int leftChild = 2 * i + 1;  
    int rightChild = 2 * i + 2;  

    if (leftChild < n && array[leftChild] > array[largest])
      largest = leftChild;
    
   
    if (rightChild < n && array[rightChild] > array[largest])
      largest = rightChild;

    if (largest != i) {
      int swap = array[i];
      array[i] = array[largest];
      array[largest] = swap;
      
  
      heapify(array, n, largest);
    }
  }
  
  public static void main(String[] args) {
    int[] array = {12, 11, 13, 5, 6, 7};
    System.out.println("Исходный массив: " + Arrays.toString(array));
    
    heapSort(array);
    
    System.out.println("Отсортированный массив: " + Arrays.toString(array));
  }
}
