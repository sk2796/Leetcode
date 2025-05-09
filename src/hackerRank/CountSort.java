package hackerRank;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,1,5,6,7,9,9,5,4,5,2,13,3,5};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        int[] freq = freqArr(arr, max);
        System.out.println(Arrays.toString(freq));
        countSort(freq, arr.length);
    }

    private static void countSort(int[] freq, int length) {
        int[] res = new int[length];
        for (int i = length-1; i>=0; i--) {
            
        }
        System.out.println(Arrays.toString(res));
    }

    private static int[] freqArr(int[] arr, int max) {
        int[] freq =new int[max+1];
        for (int x : arr) {
            freq[x]++;
        }
        return  freq;
     }
}
