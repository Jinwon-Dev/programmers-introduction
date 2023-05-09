package pg_120839;

public class Solution {

    public String solution(String rsp) {

        String answer = "";

        for (int i = 0; i < rsp.length(); i++) {

            char c = rsp.charAt(i);
            if (c == '2') answer += '0';
            else if (c == '0') answer += '5';
            else answer += '2';
        }

        /**
         * 다른 풀이
         */
//        String[] arr = rsp.split("");
//
//        for (int i = 0; i < rsp.length(); i++) {
//            if (arr[i].equals("0")) answer += "5";
//            else if (arr[i].equals("2")) answer += "0";
//            else answer += "2";
//        }
        return answer;
    }
}
