package practice;

// 다음은 JAVA 코드 문제이다.
// 가지고 있는 돈이 총 4620원일 경우
// 1000원, 500원, 100원, 10원의 지폐 및 동전을 이용하여 보기의 조건에 맞춰 최소한의 코드를 통해 괄호안을 작성하시오

//[보가]
// 변수 : m
// 연산자 : /, %
// 괄호 : [,], (,)
// 정수 : 1000, 500, 100, 10

public class test6 {
    public static void main(String[] args) {
        int m = 4620;

        int a = m/1000 ;
        int b = (m%1000 )/ 500;
        int c = (m%500)/ 100;
        int d = (m%100 )/10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
