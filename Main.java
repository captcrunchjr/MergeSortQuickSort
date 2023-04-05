import java.lang.Comparable;

/**
 *
 * @author dhruv
 */
public class Main<T extends Comparable<T>> {
    T[] data;

    public Main(T[] d) {
        data = d;
    }

    public T[] mergeSort() {
        mergeSort(0, data.length - 1);

        return data;
    }
    
    public void mergeSort(int start, int end) {
        // this.data or just data is our "arr"
        // actually perform mergeSort
    }
    
    public void merge(int start, int mid, int end) {    
        // this.data or just data is our "arr"
        
        // if you want to create an array of T
        // that is T[]
        // do this -
        // T[] newArray = (T[]) new Comparable[sizeOfArray];
    }
    
    public T[] quickSort() {
        quickSort(0, data.length - 1);

        return data;
    }
    
    public void quickSort(int start, int end) {
        // actually perform quickSort
    }
    
    public int partition(int start, int end) {
        // perform the partitioning algorithm and return the pivot
        return 0;
    }
}
