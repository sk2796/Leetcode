package Easy.binary;

public class SearchInRotatedArr {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
//        int peak = searchPeakIndex(arr);
//        System.out.println("peak "+peak+" : " + arr[peak]);
        int index = searchInRotatedArr(arr, 5);
        System.out.println(index);
    }


    //TODO -not passinig all cases
    private static int searchInRotatedArr(int[] arr, int val) {
        int low =0, high= arr.length-1;
        int index = -1;
        while(low<=high) {
            int mid = (low + high)/2;
            if(arr[mid]== val) {
                index = mid;
                return index;
            }
            if(arr[mid] > val) {
                if(arr[low] >= val) {
                    low = mid;
                }else high = mid;
            } else low= mid+1;
        }
        return index;
    }

    private static int searchPeakIndex(int[] arr) {
        int low = 0, high = arr.length-1;
        int mid = 0;
        while(low<=high) {
            mid = (low+high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            } else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return mid;
    }


}
