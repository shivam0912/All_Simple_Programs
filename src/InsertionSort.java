import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

    // Algorithm

    public void sortInsertion(int[] a,int size){
        int i,j,v;
        for (i=1;i<=size;i++){
            v = a[i];
            j =i ;
            while (a[j - 1] > v){
                a[j] = a[j-1];
                j--;
            }
            a[j] = v;                                        // Time Complexity : theta (n^2)
        }
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

        InsertionSort sorts = new InsertionSort();
        sorts.sortInsertion(a, n - 1);

        System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        input.close();
        reader.close();


    }

}
