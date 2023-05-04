package pg_120821;

import java.util.Stack;

public class Solution {

    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num_list.length; i++) {
            stack.push(num_list[i]);
        }

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = stack.pop();
        }

        /**
         * 다른 풀이
         */
//        for (int i = 0; i < num_list.length; i++) {
//            answer[i] = num_list[num_list.length - i - 1];
//        }

        return answer;
    }
}
