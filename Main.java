import java.lang.Comparable;

/**
 *
 * @author Josh Eckard
 */

public class Main<T extends Comparable<T>> {
    T[] data;
    int mid;
    /*Integer[] arr = {1, 90, 12, 0, 15, 8, 8, 5, 10};

    public Main(){
        data = (T[]) arr;
    }*/

    public Main(T[] d) {
        data = d;
    }

    public T[] mergeSort() {
        mergeSort(0, data.length - 1);

        return data;
    }
    
    public void mergeSort(int start, int end) {
        if((end-start) >= 1){
            //keep splitting and recursing
            int mid = (end + start)/2;

            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            merge(start, mid, end);

        }
        else if((end-start) < 0){
            System.err.println("Something went wrong. End < start.");
        }
        else{
            return;
        }
    }
    
    public void merge(int start, int mid, int end) {    
        T[] merged = (T[]) new Comparable[end - start + 1];
        int left = start;
        int right = mid +1;
        int i = 0;

        while(left <= mid && right <= end){
            if(data[left].compareTo(data[right]) < 0){
                merged[i] = data[left];
                i = i+1;
                left = left + 1;
            }
            else{
                merged[i] = data[right];
                i = i+1;
                right = right + 1;
            }
        }
        while(left <= mid){
            merged[i] = data[left];
            i = i + 1;
            left = left + 1;
        }
        while(right <= end){
            merged[i] = data[right];
            i = i + 1;
            right = right + 1;
        }
        for(i = start; i <= end; i++){
            data[i] = merged[i-start];
        }
    }
    
    public T[] quickSort() {
        quickSort(0, data.length - 1);

        return data;
    }
    
    public void quickSort(int start, int end) {
        if((end-start) > 1){
            int pivot = partition(start, end);

            quickSort(start, pivot - 1);
            quickSort(pivot + 1, end);
        }
        else{
            return;
        }
        
    }
    
    public int partition(int start, int end) {
        int left = start;
        int right = end;
        int mid = (end+start)/2;
        T pivot = data[mid];

        while(true){
            while(data[left].compareTo(pivot) < 0){
                left = left + 1;
            }
            while(data[right].compareTo(pivot) > 0){
                right = right - 1;
            }
            if(left >= right){
                return right;
            }

            T temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }
    
    /*public void read(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println("---------------");
    }

    public void read(T[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("---------------");
    }
    public static void main(String[] args){
        Main main = new Main();
        main.read();
        main.mergeSort();
    }*/
}
