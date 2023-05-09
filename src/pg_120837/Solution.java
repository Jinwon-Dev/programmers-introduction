package pg_120837;

public class Solution {

    public int solution(int hp) {

        int answer = 0;

        answer = (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);

        return answer;
    }
}
