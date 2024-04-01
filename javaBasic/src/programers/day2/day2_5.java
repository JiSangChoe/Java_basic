package programers.day2;

class Solution {

    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}

public class day2_5 {

    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        Solution solution = new Solution();
        System.out.println(solution.solution(my_string, overwrite_string, s));
    }
    
}


