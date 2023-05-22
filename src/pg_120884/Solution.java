package pg_120884;

public class Solution {

    public int solution(int chicken) {

        int answer = 0;

        int coupon = chicken;

        while (coupon >= 10) {
            int remain = coupon % 10;
            answer += coupon / 10;
            coupon = remain + coupon / 10;
        }

        return answer;
    }
}
