package Med;

import java.util.Arrays;

public class NoOfBalloons {
    public static void main(String[] args) {
        String text = "loonbalxbalpoon";
        String s = "balloon";
        int[] hash = new int[26];

        for(Character c : text.toCharArray()) {
            hash[c-'a']++;
        }
        System.out.println(Arrays.toString(hash));
        System.out.println(noOfBalloons(hash, s));

    }

    private static int noOfBalloons(int[] hash, String s) {
        boolean found = true;
        int count =0;
        while (found) {
            for (char c : s.toCharArray()) {
                if(hash[c - 'a']>0) {
                    hash[c-'a']--;
                } else {
                    return count;
                }
            }
            count++;
        }

        return count;
    }


}
