package LC.twoPointers;

// 2078. Two Furthest Houses With Different Colors
public class MaxDistance {
    public static void main(String[] args) {
        int[] colors = {0,1};
        System.out.println(maxDistance(colors));
    }

    private static int maxDistance(int[] colors) {
        int max = 0;
        int i = 0, j = colors.length-1;
        if(colors[i]!=colors[j]) {
            return j-i;
        }
        while (i<j) {
            if(colors[i]!=colors[j]) {
                max = j-i;
                break;
            } else j--;
        }
        j = colors.length-1;
        while (i<j) {
            if(colors[i]!=colors[j]) {
                max =Math.max(max, j-i);
                break;
            } else i++;
        }
        return max;
    }
}
