package Easy.math;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1111";
        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        int i = a.length()-1, j = b.length() -1, cf = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j >=0 || cf == 1 ) {
            if(i >=0) {
                cf = cf + a.charAt(i--) - '0';
            }
            if(j >= 0) {
                cf = cf + b.charAt(j--) - '0';
            }
            sb.append(cf % 2);
            cf = cf/2;
        }
        return sb.reverse().toString();
    }
}
