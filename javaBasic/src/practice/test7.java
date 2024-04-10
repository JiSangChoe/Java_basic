package practice;

// 다음은 n이 10일 때, 10을 2진수로 변환하는 자바 소스 코드이다. 1, 2에 알맞는 값을 적으시오.
// [출력결과] : 00001010

public class test7 {
    public static void main(String[] args) {
        int[]a = new int[8];
        int i =0; int n=10;
            //1. while의 조건식 ()
        while (i<8) {
                    // 2. (n%2)
            a[i++] = (n%2);
            n /= 2;
        }
        
        for (i=7; i>=0; i--) {
            System.out.print(a[i]);
        }
    }
}
