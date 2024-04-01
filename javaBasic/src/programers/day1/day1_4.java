package programers.day1;

// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

import java.util.Scanner;

public class day1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        
        for(int i = 0; i < b.length; i++){
            if(Character.isUpperCase(b[i])){
                System.out.print( Character.toLowerCase(b[i]));
            } else if(Character.isLowerCase(b[i])){
                System.out.print( Character.toUpperCase(b[i]) );
            }
        }
    }
}
