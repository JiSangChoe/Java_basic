package example;

import java.util.ArrayList;

// 1.정수 리스트 numList가 주어질 때, 
// 2.첫 번째로 나오는 음수의 인덱스를 return하도록 solution 메서드를 완성해주세요.
// 3. 음수가 없다면 -1을 return한다.
// 4. 메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 
//    매개변수의 타입은 정수의 배열로 받으면서 
// 5. 접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 
// 6. 인스턴스 메서드로 작성하시오.

// 제한사항
// 5 ≤ numList의 길이 ≤ 100 -->96
// -10 ≤ numList의 원소 ≤ 100

//입출력 예

//[12, 4, 15, 46, 38, -2, 15] → 5
//[13, 22, 53, 24, 15, 6] → -1

 
import java.util.List;
import java.util.Scanner;

public class Testing {
    private List<Integer> numList;

    public Testing(List<Integer> numList) {
        if (numList.size() < 5 || numList.size() > 100) {
            throw new IllegalArgumentException("numList의 길이는 5 이상 100 이하여야 합니다.");
        }
        for (int num : numList) {
            if (num < -10 || num > 100) {
                throw new IllegalArgumentException("numList의 값은 -10 이상 100 이하여야 합니다.");
            }
        }
        this.numList = numList;
    }
    public int solution() {
        if (numList.get(0) < 0) {
            return numList.get(0);
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numList의 길이를 입력하세요 (5 이상 100 이하여야 함): ");
        int length = scanner.nextInt();

        if (length < 5 || length > 100) {
            System.out.println("유효하지 않은 길이입니다.");
            return;
        }

        System.out.println("numList의 값을 입력하세요 (-10 이상 100 이하여야 함):");
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int num = scanner.nextInt();
            if (num < -10 || num > 100) {
                System.out.println("유효하지 않은 값입니다.");
                return;
            }
            numList.add(num);
        }

        try {
            Testing testingExample = new Testing(numList);
            int result = testingExample.solution();
            System.out.println("결과: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}