package Easy.twoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m && j<n) {
            if(nums1[i]>= nums2[j]) {
                res[k++] = nums2[j++];
            } else {
                res[k++] = nums1[i++];
            }
        }
        while(i<m) {
            res[k++] = nums1[i++];
        }
        while(j<n) {
            res[k++] = nums2[j++];
        }
        System.out.println(Arrays.toString(res));
        System.arraycopy(res, 0, nums1, 0, nums1.length);
    }

}
