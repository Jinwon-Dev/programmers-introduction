package pg_120843;

public class Solution {

    public int solution(int[] numbers, int k) {

        int answer = 0;

        answer = numbers[2 * (k - 1) % numbers.length];

        return answer;
    }
}
