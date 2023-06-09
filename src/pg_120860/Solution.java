package pg_120860;

public class Solution {

    public int solution(int[][] dots) {

        int answer = 0;

        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }

        answer = (maxX - minX) * (maxY - minY);

        return answer;
    }
}
