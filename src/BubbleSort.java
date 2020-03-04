import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort
{
    public void sortBubble(int[] a,int size) {
        int pass,i,temp;
        boolean swap = true;
        for (pass=size-1;pass>=0 && swap;pass--) {
            swap = false;
            for (i=0;i<=pass;i++) {
                if (a[i]>a[i+1]) {
                    // Swapping
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swap = true;
                }
            }
        }
    }                                             // Best Case Time Complexity : O(n)


    public static void main(String[] args) throws IOException
    {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];

        String line = reader.readLine(); // to read multiple integers line
        String[] str= line.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        BubbleSort sorts = new BubbleSort();
        sorts.sortBubble(a,n-1);

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(" "+a[i]);
        }
        input.close();
        reader.close();

    }
}

