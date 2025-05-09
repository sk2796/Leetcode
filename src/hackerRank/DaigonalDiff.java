package hackerRank;

public class DaigonalDiff {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{9,8,9}};
        int diff = diagonalDiff(arr);
        System.out.println(diff);
    }

    private static int diagonalDiff(int[][] arr) {
        int sums = 0, sumr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j) {
                    sums = sums + arr[i][j];
                }  if (j== arr.length-i-1) {
                    sumr= sumr + arr[i][j];
                }
            }
        }
        System.out.println(sums +" "+sumr);
        return Math.abs(sums - sumr);
    }
}
