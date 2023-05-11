package pg_120895;

public class Solution {

    public String solution(String my_string, int num1, int num2) {

        String answer = "";

        String[] arr = my_string.split("");

        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        answer = String.join("", arr);

//        for (String str : arr) {
//            answer += str;
//        }

        return answer;
    }
}
