import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    public void quickSort(int[] a,int low,int high){

        int p;
        //Terminating
        if (low<high){
            p = partitioning(a, low, high);
            quickSort(a,low,p-1);
            quickSort(a,p+1,high);
        }
    }

    public int partitioning(int[] a,int low,int high){

        int pivot = a[high];

        for (int i=low; i<= high; i++){

            if (a[i]<pivot)
            {
                /*int temp;
                temp = a[i];
                a[i] = a[low];
                a[low] = temp;*/

                swap(a,low,i);
                low++;

            }
        }
       /*int temp;
       temp = a[low];
       a[low] = pivot;
       a[high] = temp*/

       swap(a,high,low);
       return low;
    }
    public void swap(int[] a,int low,int i){
        int temp;
        temp = a[i];
        a[i] = a[low];
        a[low] = temp;

    }
    public void sortedArray(int[] a,int size){
        for (int i=0;i<size;i++)
            System.out.print(" " +a[i]);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        System.out.print("Enter the size of Array: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Enter the element of Array: ");
        int[] a = new int[n];

        String line = reader.readLine(); // to read multiple integers line
        String[] str= line.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        QuickSort sort = new QuickSort();
        sort.quickSort(a,0,n-1);
        System.out.println("Sorted array:");
        sort.sortedArray(a,n);
    }


}
