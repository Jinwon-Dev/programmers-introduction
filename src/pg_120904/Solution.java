package pg_120904;

public class Solution {

    public int solution(int num, int k) {

        int answer = 0;

        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k + '0') {
                answer = i + 1;
                break;
            } else answer = -1;
        }

        return answer;
    }
}
