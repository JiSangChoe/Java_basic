package programers.day2;

import java.util.Scanner;

public class day2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
