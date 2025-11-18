package Easy.newStart;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"a", "a"};
        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        if(strs.length<=1 || strs[0].length()<=1) {
            System.out.println("");
            return;
        } else {
            int j = 0;
//            sb.append(strs[0].charAt(j));
            while (strs[0].charAt(j) == strs[strs.length-1].charAt(j)) {
                sb.append(strs[0].charAt(j));
                j++;
            }
        }



//        int j = 0;
//        if(strs.length<=1) {
//            return;
//        }
//
//        while(j< strs[0].length()) {
//            sb.append(strs[0].charAt(j));
//            for (int i = 0; i < strs.length; i++) {
//                if(strs[i].length() <= j) {
//
//                    if(strs[i].charAt(j) != sb.charAt(j)) {
//                        sb.deleteCharAt(j);
//                        System.out.println(sb);
//                        return;
//                    }
//
//
//                }
//            }
//            j++;
//        }
        System.out.println(sb);

//        while(j< strs.length && !strs[0].isEmpty()) {
//            sb.append(strs[0].charAt(j));
//            for (int i = 0; i < strs.length; i++) {
//                if(strs[i].charAt(j)!= sb.charAt(j)) {
//                    if(sb.length()>0) {
//                        sb.deleteCharAt(j);
//                    }
//                    System.out.println(sb);
//                }
//
//            }
//            j++;
//        }
    }
}
