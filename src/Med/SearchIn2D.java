package Med;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(isTargetFound(arr, target));
    }

    private static boolean isTargetFound(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int low = 0;
        int high = m * n -1;

        while(low<=high) {
            int mid = (low + high) / 2;
            int currRow = mid / n;
            int currCol = mid % n;
            if(arr[currRow][currCol]== target) {
                return true;
            } else if( arr[currRow][currCol] < target) {
                low = mid + 1;
            } else high = mid -1;
        }
        return false;
    }


}