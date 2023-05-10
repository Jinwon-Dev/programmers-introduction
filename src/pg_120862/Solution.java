package pg_120862;

import java.util.Arrays;

public class Solution {

    public int solution(int[] numbers) {

        int answer = 0;

        Arrays.sort(numbers);

        int minus = numbers[0] * numbers[1];
        int plus = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        answer = Math.max(minus, plus);

        return answer;
    }
}
