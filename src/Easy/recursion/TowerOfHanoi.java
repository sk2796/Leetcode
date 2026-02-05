package Easy.recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {

        int n = 5;
        towerOfHanoi(n, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int n, char a, char b, char c) {

        if(n>0) {
            towerOfHanoi(n-1, a,c,b);
            System.out.println("Move "+a+" to "+c+" using "+ b);
            towerOfHanoi(n-1, b,a,c);
        }
    }
}
