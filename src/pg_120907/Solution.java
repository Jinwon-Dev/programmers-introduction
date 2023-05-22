package pg_120907;

public class Solution {

    public String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int tmp = 0;

            if (str[1].equals("-")) tmp = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            else if (str[1].equals("+")) tmp = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);

            if (tmp == Integer.parseInt(str[4])) answer[i] = "O";
            else answer[i] = "X";
        }

        return answer;
    }
}
