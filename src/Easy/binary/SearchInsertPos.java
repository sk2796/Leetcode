package Easy.binary;

public class SearchInsertPos {
    public static void main(String[] args) {

        //35. Search Insert Position
        int[] arr = {1,2,3,5,6,8,11};
        int search = 9;
        int index = searchInsert(arr, search);
        System.out.println(index);
    }

    private static int searchInsert(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target) {
                index = mid;
                return index;
            } else if(nums[mid] > target) {
                end = mid -1;
            } else start = mid+1;
        }
        return start;
    }
}
