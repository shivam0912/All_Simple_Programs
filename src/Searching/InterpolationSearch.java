package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterpolationSearch {

    public static int interpolationSearch(int[] a,int size,int data){
        int low=0;
        int high = size;
        int mid;
        while(low<=high && data<=a[high] && data>=a[low]){
            mid = low + (((data + a[low]) * (high - low))/ (a[high] - a[low]));
            if(data==a[mid]){
                return mid;
            }else if (data< a[mid]){
                high = mid-1;
            }
            else{
               low =mid+1;
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
        String[] str = line.trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        System.out.print("Enter the element that you want to search: ");
        int data = Integer.parseInt(reader.readLine());

        if(interpolationSearch(a,n-1,data)==-1)
            System.out.println("Sorry ): Element is not available in the array:");
        else
            System.out.println("Element at the position: "+interpolationSearch(a,n-1,data));
    }
}

