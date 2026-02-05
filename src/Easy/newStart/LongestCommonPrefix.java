package Easy.newStart;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
//        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strs[0].length()) {
            sb.append(strs[0].charAt(i));
            for (String str : strs) {
                if(str.length() > i) {
                    if(str.charAt(i)!= sb.charAt(i)) {
                        sb.deleteCharAt(i);
                        System.out.println(sb);
                        return;
                    }
                }
            }
            i++;
        }
        sb.deleteCharAt(i-1);
        System.out.println(sb);
    }
}
