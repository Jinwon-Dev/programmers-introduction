package pg_120956;

public class Solution {

    public int solution(String[] babbling) {

        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {

            for (String arrStr : arr) {
                str = str.replace(arrStr, " ");
            }

            if (str.replaceAll(" ", "").equals("")) answer++;
        }

        return answer;
    }
}
