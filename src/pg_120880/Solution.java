package pg_120880;

import java.util.*;

public class Solution {

    public int[] solution(int[] numlist, int n) {

        int[] answer = new int[numlist.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : numlist) {
            list.add(num);
        }

        Collections.sort(list, new Comparator<Integer>() {
            
            @Override
            public int compare(Integer o1, Integer o2) {

                int gap1 = Math.abs(o1 - n);
                int gap2 = Math.abs(o2 - n);

                if (gap1 == gap2) return o2 - o1; // 내림차순

                return gap1 - gap2; // 오름차순, 절댓값을 생각하여 o1 - o2를 하면 X
            }
        });

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
