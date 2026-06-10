package LC;

public class FarthestPointFromOrigin {
    //2833. Furthest Point From Origin
    public static void main(String[] args) {
        String s = "_R__LL_";
        System.out.println(furthestDistanceFromOrigin(s));
    }

    public static int furthestDistanceFromOrigin(String moves) {
        int sumL = 0;
        int sumR = 0;
        for(char c : moves.toCharArray()) {
            if(c=='_') {
                sumL = sumL + 1;
            } else sumL = sumLR(sumL, c);
        }
        for(char c : moves.toCharArray()) {
            if(c=='_') {
                sumR = sumR - 1;
            } else sumR = sumLR(sumR, c);
        }
        return Math.max(Math.abs(sumL), Math.abs(sumR));
    }

    private static int sumLR(int sumL, char c) {
        return c == 'L' ? sumL - 1 : sumL + 1;
    }
}
