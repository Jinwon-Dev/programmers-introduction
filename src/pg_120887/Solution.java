package pg_120887;

public class Solution {

    public int solution(int i, int j, int k) {

        int answer = 0;

        for (int l = i; l <= j; l++) {

            String[] arr = String.valueOf(l).split("");

            for (int n = 0; n < arr.length; n++) {
                if (arr[n].equals(String.valueOf(k))) answer++;
            }
        }

        return answer;
    }
}
