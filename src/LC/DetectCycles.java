package LC;


import java.util.HashSet;
import java.util.Set;
// 1559. Detect Cycles in 2D Grid
public class DetectCycles {
    public static void main(String[] args) {
        char[][] grid = {
                {'c','c','c','a'},
                {'c','d','c','c'},
                {'c','c','e','i'},
                {'c','c','c','c'}
        };
        System.out.println(containsCycle(grid));
    }

    private static boolean containsCycle(char[][] grid) {
        Set<Character> hset = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                hset.add('0');
                if(!hset.contains(grid[i][j])) {
                    hset.add(grid[i][j]);
                    if( j < grid[0].length-1 && grid[i][j] == grid[i][j+1] ) {
                         return containsCycleR(grid, i, j+1, i, j);
                    } else if(i < grid.length-1 && j == grid[0].length-1) {
                        return containsCycleR(grid, i+1, 0, i, j);
                    } else if(i == grid.length-1 && j == grid[0].length-1) {
                        return false;
                    }

                }
            }
        }
        return false;
    }

    private static boolean containsCycleR(char[][] grid, int i, int j,
                                       int initialRow, int initialCol) {

        if(i== initialRow && j == initialCol) {
            return true;
        }

        if(j < grid[i].length - 1  && grid[initialRow][initialCol] == grid[i][j+1]) {
            grid[i][j] = '0';
             containsCycleR(grid, i, j+1, initialRow, initialCol);
        }
        if( i < grid.length-1 && grid[initialRow][initialCol] == grid[i+1][j]) {
            grid[i][j] = '0';
             containsCycleR(grid, i+1, j, initialRow, initialCol);
        }
        if(j > 0 && grid[initialRow][initialCol] == grid[i][j-1]) {
            grid[i][j] = '0';
             containsCycleR(grid, i, j-1, initialRow, initialCol);
        }
        if(i > 0 && grid[initialRow][initialCol] == grid[i-1][j]) {
            grid[i][j] = '0';
             containsCycleR(grid, i-1, j, initialRow, initialCol);
        }

        return true;
    }
}
