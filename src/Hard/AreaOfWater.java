package Hard;

public class AreaOfWater {
    public static void main(String[] args) {
        //Calculate max area of water in a container
        int[] height = {2,3,4,5,18,17,6};
        int areaMax = 0;
        int i =0, j = height.length-1;
        while(i < j) {
            int heightMin = Math.min(height[i], height[j]);
            int area = heightMin * (j - i);
            areaMax = Math.max(area, areaMax);
            int k = height[i] >= height[j] ? j-- : i++;
        }
        System.out.println(areaMax);
    }
}
