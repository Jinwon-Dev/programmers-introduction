package pg_120850;

import java.util.Arrays;

public class Solution {

    public int[] solution(String my_string) {

        int[] answer = {};

        my_string = my_string.replaceAll("[a-z]", "");
        answer = new int[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
