package pg_120886;

import java.util.Arrays;

public class Solution {

    public int solution(String before, String after) {

        int answer = 0;

        char[] befarr = before.toCharArray();
        char[] aftarr = after.toCharArray();

        Arrays.sort(befarr);
        Arrays.sort(aftarr);

        String befstr = new String(befarr);
        String aftstr = new String(aftarr);

        if (befstr.equals(aftstr)) answer = 1;
        else answer = 0;

        return answer;
    }
}
