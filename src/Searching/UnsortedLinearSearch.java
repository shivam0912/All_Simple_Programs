package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnsortedLinearSearch {

    public static int unsortedLinearSearch(int[] a,int size,int data){
        for(int i=0;i<=size;i++){
            if (a[i] == data){              // Time Complexity: O(n)
                                           // Space Complexity: O(1)
                return i;
            }

        }
        return -1;
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

        System.out.print("Enter the element that you want to search: ");
        int data = Integer.parseInt(reader.readLine());

        if(unsortedLinearSearch(a,n-1,data)==-1)
            System.out.println("Sorry ): Element is not available in the array:");
        else
            System.out.println("Element at the position: "+unsortedLinearSearch(a,n-1,data));

    }
}
