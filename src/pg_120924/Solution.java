package pg_120924;

public class Solution {

    public int solution(int[] common) {

        int answer = 0;
        int gap = 0;

        if (common[0] - common[1] == common[1] - common[2]) {
            gap = common[1] - common[0];
            answer = common[common.length - 1] + gap;
        } else if (common[1] / common[0] == common[2] / common[1]) {
            gap = common[1] / common[0];
            answer = common[common.length - 1] * gap;
        }

        return answer;
    }
}
