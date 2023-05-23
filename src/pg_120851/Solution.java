package pg_120851;

public class Solution {

    public int solution(String my_string) {

        int answer = 0;

        my_string = my_string.toLowerCase().replaceAll("[a-z]", "");

        String[] arr = my_string.split("");

        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}
