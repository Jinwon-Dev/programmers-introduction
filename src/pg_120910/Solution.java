package pg_120910;

public class Solution {

    public int solution(int n, int t) {

        int answer = 0;

        answer = n * (int) Math.pow(2, t);

        return answer;
    }
}
