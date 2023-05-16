package pg_120848;

public class Solution {

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; factorial(i) <= n; i++) {
            answer = i;
        }

        return answer;
    }

    public int factorial(int n) {

        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
