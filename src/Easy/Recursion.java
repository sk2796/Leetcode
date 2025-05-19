package Easy;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int n = 8;
        printFromFirst(n);
        System.out.println();
        printFromLast(n);
        System.out.println();
        int sum = sumOfFirstNumbers(n);
        System.out.println(sum);
        int[] arr = {4,7,3,1,9,2};
        reverseAnArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        String s = "aaabaa";
        System.out.println(checkStringPallindrome(s, 0, s.length()-1));
    }

    private static boolean checkStringPallindrome(String s, int i, int j) {
        if(i>=j) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)) {
            return false;
        }
        else return checkStringPallindrome(s, i+1, j-1);
    }

    private static void reverseAnArray(int[] arr, int i, int j) {
        if(i>=j) {
            return;
        }
        swap(arr, i, j);
        reverseAnArray(arr, i+1, j-1);
    }

    private static int sumOfFirstNumbers(int n) {
        if(n<=1) {
            return 1;
        }
        return n + sumOfFirstNumbers(n-1) ;
    }

    private static void printFromLast(int n) {
        if(n<0) {
            return;
        }
        System.out.print(n+ " ");
        printFromLast(n-1);
    }

    private static void printFromFirst(int n) {
        if(n<0) {
            return;
        }
        printFromFirst(n-1);
        System.out.print(n+ " ");
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
