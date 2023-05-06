package pg_120849;

public class Solution {

    public String solution(String my_string) {

        String answer = "";

        answer = my_string.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");

        /**
         * 다른 풀이
         */
//        answer = my_string.replaceAll("[aeiou]", "");
//        answer = my_string.replaceAll("[a,e,i,o,u]", "");
//        answer = my_string.replaceAll("a|e|i|o|u", "");

        return answer;
    }
}
