package Week.Week_1;
/*
Question 1
Geek is participating in a coding cotest.His score,N,can only consist of digits 7and 9 .
He has the power to update his score by changing at most one digit.Help hi find the maximum score.
Note:You can convert 7to 9,and 9to 7;
input:9779
output:9979
*/

public class maxnum {

    public static int getMaxScore(int N) {
        String N_str = String.valueOf(N);
        int max_score = N;


        for (int i = 0; i < N_str.length(); i++) {
            if (N_str.charAt(i) == '7') {

                int updated_num = Integer.parseInt(N_str.substring(0, i) + '9' + N_str.substring(i + 1));
                max_score = Math.max(max_score, updated_num);
            } else if (N_str.charAt(i) == '9') {

                int updated_num = Integer.parseInt(N_str.substring(0, i) + '7' + N_str.substring(i + 1));
                max_score = Math.max(max_score, updated_num);
            }
        }

        return max_score;
    }

    public static void main(String[] args) {
        int N = 9779;
        int result = getMaxScore(N);
        System.out.println("Max score: " + result);
    }
}

