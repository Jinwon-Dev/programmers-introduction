package pg_120923;

public class Solution {

    public int[] solution(int num, int total) {

        int[] answer = new int[num];

        int index = (total / num) + (1 - num) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = index++;
        }

        return answer;
    }
}
