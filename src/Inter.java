import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Inter {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        List<String> list = List.of("sjjfldf", "fgds", "fswfwe", "egefgr", "gergegsdsv", "sjjfldf");

        Map<String, Integer> hmap = list.stream().distinct()
                .collect(Collectors.toMap(i -> i, String::length));

//        System.out.println(hmap);

        int[][] obstacleData = new int[][]{
                {3, 4, 5, 6},

                {4, 4, 4, 5},

                {4, 5, 4, 6},

                {5, 5, 3},
                {1}
        };

        int sum = 0;
        for (int i = 0; i < obstacleData[0].length; i++) { //
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < obstacleData.length; j++) {

                if (i < obstacleData[j].length) {
                    int val = obstacleData[j][i];
                    min = Math.min(min, obstacleData[j][i]);
                }


//                if(obstacleData[i].length<i) {
//                    min = Math.min(min, obstacleData[i][j]);
//                }
            }
            sum = sum + min;
        }

//        for (int i = 0; i < obstacleData.length; i++) {
//            int min = Integer.MAX_VALUE;
//            for (int j = 0; j < obstacleData[i].length; j++) {
//                min = Math.min(min, obstacleData[j][i]);
//            }
//            sum = sum + min;
//        }

        System.out.println(sum);

    }



}
