package pg_120885;

public class Solution {

    public String solution(String bin1, String bin2) {

        String answer = "";

        // 2진수를 10진수로 변환 및 덧셈, 그 후 10진수를 2진수로 변환
        answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));

        return answer;
    }
}
