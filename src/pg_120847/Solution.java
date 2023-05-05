package pg_120847;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public int solution(int[] numbers) {

        int answer = 0;
        Integer[] number = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        Arrays.sort(number, Collections.reverseOrder());

        answer = number[0] * number[1];

        /**
         * 다른 풀이
         */
//        Arrays.sort(number);
//        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}
