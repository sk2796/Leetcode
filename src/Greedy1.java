import java.util.Arrays;
import java.util.Comparator;

public class Greedy1 {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;

        System.out.println(fractionalKnapsack(val, wt, capacity));
    }

    private static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        
        int[][] items = new int[val.length][2];
        for (int i = 0; i < items.length; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }
        for (int i = 0; i < items.length; i++) {
            System.out.println(Arrays.toString(items[i]));
        }

        System.out.println("----------");
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double r1 = (1.0 * o1[0]) / o1[1];
                double r2 = (1.0 * o2[0]) / o2[1];
                return Double.compare(r2, r1);
            }
        });
        for (int i = 0; i < items.length; i++) {
            System.out.println(Arrays.toString(items[i]));
        }

        double res = 0.0;
        int currentCapacity = capacity;

        for (int i = 0; i < items.length; i++) {
            if(items[i][1] <= currentCapacity) {
                res += items[i][0];
                currentCapacity -= items[i][1];
            } else {
                res += (1.0 * items[i][0] / items[i][1]) * currentCapacity;
                break;
            }
        }

        return res;
    }
}
