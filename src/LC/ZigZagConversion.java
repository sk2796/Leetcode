package LC;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        s = zigzag(s, 3);
        System.out.println(s);
    }

    private static String zigzag(String s, int k) {

        String[][] strings = new String[k][3*k];
        int index = 0;
        for (int col = 0; col < 3 * k; col++) {
            for (int row = 0; row < k; row++) {
                if (index < s.length() &&
                        (col % (k - 1) == 0 || row == (k - col % (k - 1) - 1))) {

                    strings[row][col] = String.valueOf(s.charAt(index));
                    index++;
                }
            }
        }

        for (int i = 0; i < 3 * k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(strings[j][i]+"     ");
            }
            System.out.println();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 3 * k; j++) {
                if(strings[i][j]!=null && sb.length()!=s.length()) {
                    sb.append(strings[i][j]);
                }
            }
        }

        return sb.toString();
    }
}
