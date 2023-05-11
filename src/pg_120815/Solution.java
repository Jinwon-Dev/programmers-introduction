package pg_120815;

public class Solution {

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i * 6 % n == 0) {
                answer = i;
                break;
            }
        }

        /**
         * 다른 풀이
         */
//        int answer = 1;
//
//        while (true) {
//            if (6 * answer % n == 0) break;
//            answer++;
//        }
        return answer;
    }
}
