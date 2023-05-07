package pg_120909;

public class Solution {

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i * i == n) answer = 1;
        }

        if (answer != 1) answer = 2;

        /**
         * 다른 풀이
         */
//        if (n % Math.sqrt(n) == 0) answer = 1;
//        else answer = 2;

        return answer;
    }
}
