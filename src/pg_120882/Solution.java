package pg_120882;

public class Solution {

    public int[] solution(int[][] score) {

        int[] answer = new int[score.length];
        double[] arr = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            arr[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        for (int i = 0; i < score.length; i++) {
            int count = 0;

            for (int j = 0; j < score.length; j++) {
                if (arr[i] < arr[j]) count++;
            }

            answer[i] = count + 1;
        }

        return answer;
    }
}
