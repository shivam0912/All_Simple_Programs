package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchByRecursive {

     public static int binaryRecursiveSearch(int[] a, int low, int high, int data) {
        int mid = (low + high) / 2;
        if (low == high) {                                           //Time Complexity : O(log n)
            if(a[low]==data)
                return low;
            else
                return -1;
        }
        else {
            if (a[mid] == data) {
                return mid;
            }
             if (a[mid] < data) {
                return binaryRecursiveSearch(a, mid + 1, high, data);
             }
             else {
                return binaryRecursiveSearch(a, low, mid - 1, data);
             }
        }
     }
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Enter the size of Array: ");
        int n = Integer.parseInt(reader.readLine());

        System.out.print("Enter the element of Array: ");
        int[] a = new int[n];

        String line = reader.readLine(); // to read multiple integers line
        String[] str = line.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        System.out.print("Enter the element that you want to search: ");
        int data = Integer.parseInt(reader.readLine());

        if(binaryRecursiveSearch(a,0,n-1,data)==-1)
            System.out.println("Sorry ): Element is not available in the array:");
        else
            System.out.println("Element at the position: "+binaryRecursiveSearch(a,0,n-1,data));
    }
}
