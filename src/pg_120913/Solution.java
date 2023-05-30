package pg_120913;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String[] solution(String my_str, int n) {

        String[] answer = {};
        List<String> list = new ArrayList<>();
        String tmp = "";

        for (int i = 0; i < my_str.length(); i++) {
            tmp += my_str.charAt(i);
            if (tmp.length() == n || i + 1 == my_str.length()) {
                list.add(tmp);
                tmp = "";
            }
        }

        answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
