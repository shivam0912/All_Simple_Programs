import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {
    void mergeSort(int[] a,int[] temp,int left,int right){
        int mid;
       if (left<right){
           mid = (left + right)/2;        // This is mid of whole array
           mergeSort(a,temp,left,mid);    // Sort Left
           mergeSort(a,temp,mid+1,right); // Sort Right
           Merge(a,temp,left,mid+1,right);

       }                                       // Time complexity : Theta(n log n)
    }

    void Merge(int[] a,int[] temp,int left,int mid,int right){
        int left_end,size,temp_pos;
        left_end = mid-1;
        temp_pos = left;
        size = right-left+1;
        while ((left<=left_end) && (mid<=right)){
            if(a[left]<=a[mid]){
                temp[temp_pos]  = a[left];
                temp_pos = temp_pos+1;
                left =left+1;
            }
            else{
                temp[temp_pos] = a[mid];
                temp_pos = temp_pos+1;
                mid =mid+1;
            }
        }
        while (left<=left_end){
            temp[temp_pos]  = a[left];
            left =left+1;
            temp_pos = temp_pos+1;
        }
        while (mid<=right){
            temp[temp_pos] = a[mid];
            mid =mid+1;
            temp_pos = temp_pos+1;
        }
        for (int i=0;i<size;i++){
            a[right]= temp[right];
            right =right-1;
        }
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
        int[] temp = new int[n];

        String line = reader.readLine(); // to read multiple integers line
        String[] str= line.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        MergeSort sort = new MergeSort();
        sort.mergeSort(a,temp,0,n-1);
        System.out.println("Sorted array:");
        sort.sortedArray(a,n);

    }
}
