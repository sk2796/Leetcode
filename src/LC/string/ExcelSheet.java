package LC.string;

import java.util.Arrays;

public class ExcelSheet {

    public static void main(String[] args) {

        String[] alphabets = new String[27];
        for (int i = 1; i <= 26; i++) {
            alphabets[i] = String.valueOf((char) ('A' + i -1));
        }
        System.out.println(Arrays.toString(alphabets));
        int columnNumber = 70;
        String columnTitle = numberToColumn(columnNumber, alphabets);
        System.out.println(columnTitle);
        System.out.println(columnToNumber(columnTitle));

    }

    // 171. Excel Sheet Column Number
    private static long columnToNumber(String columnTitle) {
        //AAA
        long sum = 0;
        for (int i = columnTitle.length()-1; i >=0 ; i--) {
            int charTonum = columnTitle.charAt(i) - 64;
            double pow = Math.pow(26, columnTitle.length() - i - 1);
            sum = (long) (sum + (charTonum * pow));
        }

        return sum;
    }


    //168. Excel Sheet Column Title
    private static String numberToColumn(int columnNumber, String[] alphabets) {
        if(columnNumber <=26) {
            return alphabets[columnNumber];
        }
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            int rem = columnNumber % 26;
            sb.append(alphabets[rem==0 ? 26 : rem]);
            columnNumber = rem == 0 ? columnNumber - 26 : columnNumber - rem;
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();
    }
}
