package pg_120861;

public class Solution {

    public int[] solution(String[] keyinput, int[] board) {

        int[] answer = new int[board.length];

        int width = board[0] / 2;
        int height = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left") && answer[0] > -width) answer[0]--;
            else if (keyinput[i].equals("right") && answer[0] < width) answer[0]++;
            else if (keyinput[i].equals("up") && answer[1] < height) answer[1]++;
            else if (keyinput[i].equals("down") && answer[1] > -height) answer[1]--;
        }

        return answer;
    }
}
