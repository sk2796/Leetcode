package Easy.string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExcelSheet {

    //168. Excel Sheet Column Title
    //TODO - Not Working
    public static void main(String[] args) {

        String[] alphabets = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = String.valueOf((char) ('A' + i));
        }
        System.out.println(Arrays.toString(alphabets));
        int columnNumber = 52;
        System.out.println(numberToColumn(columnNumber, alphabets));

    }

    private static String numberToColumn(int columnNumber, String[] alphabets) {
        StringBuilder sb = new StringBuilder();
        int rem = 1;
        while(columnNumber > 0 || rem!=0) {
            rem = columnNumber % 26;
            sb.append(rem == 0 ? alphabets[25] : alphabets[rem - 1]);
            columnNumber = columnNumber - rem;
            columnNumber = columnNumber / 26;
        }

        System.out.println(sb.reverse());




//        if(columnNumber <= 26) {
//            return alphabets[columnNumber-1];
//        }

//        int rem = columnNumber%26 == 0 ? 26 : columnNumber % 26;
//        sb.append(alphabets[rem-1]);
//        System.out.println(sb);
//        columnNumber = columnNumber - rem;
//
//        while(columnNumber>26 || rem != 0) {
//            columnNumber = columnNumber/26;
//            rem = columnNumber % 26;
//                sb.append(alphabets[columnNumber - 1]);
//        }
//        columnNumber = columnNumber / 26;
//        sb.append(alphabets[columnNumber-1]);
        return sb.reverse().toString();
    }
}
