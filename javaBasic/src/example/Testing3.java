package example;

// 정수 number가 주어질 때, 주어진 number의 자리 수의 합을 return한다. 
// 단, 입력 값이 0이하의 정수이면 0을 반환한다.
// 메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 
// 매개변수의 타입은 정수로 받으면서 접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 
// 구현부가 존재하는 인스턴스 메서드로 작성하시오.


import java.util.Scanner;

public class Testing3 {
    public int solution(int number) {
        if (number <= 0 || number > 2000000000) {
            return 0;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int userInput = scanner.nextInt();

        Testing3 solution = new Testing3();
        int result = solution.solution(userInput);

        System.out.println("자리 수의 합: " + result);
    }
}