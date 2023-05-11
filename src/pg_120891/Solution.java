package pg_120891;

public class Solution {

    public static int solution(int order) {

        int answer = 0;

        String s = String.valueOf(order);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 3 == 0 && s.charAt(i) != '0') answer++;
        }

        return answer;
    }
}
