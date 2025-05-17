package Easy.twoPointers;

import java.util.Arrays;

public class IndexOfFirstIndex {
    public static void main(String[] args) {
        String haystack = "fdsadjkasad", needle = "sad";
//        int index = strStr(haystack, needle);
//        System.out.println(index);

        String sentence = "hellohello hellohellohello", searchWord = "ell";
        int index1 = searchWordInSentence(sentence, searchWord);
//        System.out.println(index1);

        String s = "   fly me   to   the moon  ";
        int length = lengthOfLastWord(s);
        System.out.println(length);
    }

    private static int lengthOfLastWord(String s) {
        s = s.trim();
        System.out.println(s);
        String[] sArr = s.split(" ");
        System.out.println(Arrays.toString(sArr));
        return sArr[sArr.length-1].trim().length();
    }

    private static int searchWordInSentence(String sentence, String searchWord) {
        int index = -1;
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(s[i].contains(searchWord) && s[i].startsWith(searchWord)) {
                index = i+1;
                return index;
            }
        }
        
        return index;
    }

    private static int strStr(String haystack, String needle) {
        int index = -1;
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return index;
    }
}
