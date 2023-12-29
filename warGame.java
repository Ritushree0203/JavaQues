import java.util.*;

class Game {
    char[] team_left = {'m', 'q', 'd', 'z'};
    char[] team_right = {'w', 'p', 'b', 's'};
    int[] power = new int[4];

    Game() {
        for (int i = 0; i < 4; i++) {
            power[i] = i;
        }

    }



    void whoWins(String word) {
        int left_sum = 0;
        int right_sum = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < team_left.length; j++) {
                if (word.charAt(i) == team_left[j]) {

                    switch (j) {
                        case 0 -> left_sum = left_sum + power[3];
                        case 1 -> left_sum = left_sum + power[2];
                        case 2 -> left_sum = left_sum + power[1];
                        case 3 -> left_sum = left_sum + power[0];
                    }
                } else if (word.charAt(i) == team_right[j]) {
                    right_sum = switch (j) {
                        case 0 -> right_sum + power[3];
                        case 1 -> right_sum + power[2];
                        case 2 -> right_sum + power[1];
                        case 3 -> right_sum + power[0];
                        default -> right_sum;
                    };
                }
            }

        }
        if (left_sum > right_sum) {
            System.out.println("left-side wins");
        } else if (left_sum < right_sum) {
            System.out.println("right-side wins");
        } else {
            System.out.println("Try again");
        }
    }

    int lSum(String leftWord){
        int left_sum = 0;
        int right_sum = 0;
        for (int i = 0; i < leftWord.length(); i++){
            switch(leftWord.charAt(i)){
                case 'm' -> left_sum = left_sum + power[3];
                case 'q' -> left_sum = left_sum + power[2];
                case 'd' -> left_sum = left_sum + power[1];
                case 'z' -> left_sum = left_sum + power[0];
            }
        }
        return left_sum;
    }
    int rSum(String rightWord){
        int left_sum = 0;
        int right_sum = 0;
        for (int i = 0; i < rightWord.length(); i++){
            switch(rightWord.charAt(i)){
                case 'w' -> right_sum = right_sum + power[3];
                case 'p' -> right_sum = right_sum + power[2];
                case 'b' -> right_sum = right_sum + power[1];
                case 's' -> right_sum = right_sum + power[0];
            }
        }
        return right_sum;
    }
    void whoWins(String left, String right) {
            int lsum = lSum(left);
            int rsum = rSum(right);


        if (lsum > rsum){
            System.out.println("left-side wins");
        }
        else if (lsum < rsum){
            System.out.println("right-side wins");
        }
        else {
            System.out.println("Try again");
        }
            }

        }





public class warGame{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
        Game play = new Game();
        play.whoWins("wqqqq");
        play.whoWins("mqzd","wpbs");


    }
}