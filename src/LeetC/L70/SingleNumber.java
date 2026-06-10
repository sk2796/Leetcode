package LeetC.L70;

public class SingleNumber {

    // 136. Single Number
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,3};
        int hash = 0;
        for(int num : nums) {
            hash = hash ^ num;
        }
        System.out.println(hash);
    }
}
