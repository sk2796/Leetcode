package Easy.newStart;


import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reversedString(s));
    }

    private static String reversedString(String s) {
        List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
        int i =0, j = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(i < j) {
            if(!vowels.contains(String.valueOf(s.charAt(i)))) {
                i++;
            } else if(!vowels.contains(String.valueOf(s.charAt(j)))) {
                j--;
            } else if(vowels.contains(String.valueOf(s.charAt(i))) &&
                    vowels.contains(String.valueOf(s.charAt(j)))) {

                char temp = s.charAt(i);
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, temp);
                i++; j--;
            }
        }
        return sb.toString();
    }
}
