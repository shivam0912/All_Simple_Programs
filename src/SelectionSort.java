import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {

    public void sortSelection(int[] a,int size){
        int temp,i,j,min;
        for (i=0;i<size;i++){
            min = i;
            for (j=i+1;j<size+1;j++){
                if(a[j]<a[min])
                min = j;
            }
            // swapping
            temp = a[min];
            a[min]  = a[i];
            a[i] = temp;
        }                                                     // Time Complexity : O(n^2) -->> Best/Worst/Average Cases

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];

        String line = reader.readLine(); // to read multiple integers line
        String[] str = line.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        SelectionSort sorts = new SelectionSort();
        sorts.sortSelection(a, n - 1);

        System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        input.close();
        reader.close();
    }
}
