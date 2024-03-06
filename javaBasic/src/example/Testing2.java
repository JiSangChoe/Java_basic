package example;

// 1. 정수 배열 array와 2차원 정수 배열 queries이 주어진다. 
// 2. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 형태다.
// 3. 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 array[index]에 1을 더한다.
// 4. 위 규칙에 따라 queries를 처리한 이후의 array를 return 한다.
// 5. 메서드의 반환 타입은 정수의 배열이고 메서드명은 solution,
// 6. 매개변수의 타입은 1차원 정수 배열 타입 array, 2차원 정수 배열 타입 queries 로 받으면서 
// 7. 접근 제어는 모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.

// 1 ≤ array의 길이 ≤ 1,000
// - 0 ≤ arr의 원소 ≤ 1,000,000

// 1 ≤ queries의 길이 ≤ 1,000
// - 0 ≤ s ≤ e < arr의 길이



import java.util.Arrays;
import java.util.Scanner;

public class Testing2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // 배열의 길이 입력 (1 ≤ array의 길이 ≤ 1,000)
        System.out.print("배열의 길이를 입력하세요 (1 이상 1,000 이하): ");
        int length = scanner.nextInt();
        
     // 배열의 각 원소 입력 (0 ≤ arr의 원소 ≤ 1,000,000)
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("배열의 " + i + "번째 원소를 입력하세요 (0 이상 1,000,000 이하): ");
            array[i] = scanner.nextInt();
        }
        
     // 쿼리의 개수 입력 (1 ≤ queries의 길이 ≤ 1,000) 
        System.out.print("queries의 개수를 입력하세요 (1 이상 1,000 이하): ");
        int queryCount = scanner.nextInt();
        int[][] queries = new int[queryCount][2];
      
        for (int i = 0; i < queryCount; i++) {
            System.out.print("queries의 " + i + "번째 시작 인덱스를 입력하세요 (0 이상 " + (length - 1) + " 이하): ");
            queries[i][0] = scanner.nextInt();

            System.out.print("queries의 " + i + "번째 끝 인덱스를 입력하세요 (" + queries[i][0] + " 이상 " + (length - 1) + " 이하): ");
            queries[i][1] = scanner.nextInt();
        }

        Testing2 solution = new Testing2();
        int[] result = solution.solution(array, queries);
        System.out.println("결과: " + Arrays.toString(result));
    }

    public int[] solution(int[] array, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                array[i]++;
            }
        }

        return array;
    }
}

//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // 배열의 길이 입력 (1 ≤ array의 길이 ≤ 1,000)
//        System.out.print("배열의 길이를 입력하세요 (1 이상 1,000 이하): ");
//        int length = scanner.nextInt();
//
//        // 배열의 각 원소 입력 (0 ≤ arr의 원소 ≤ 1,000,000)
//        int[] array = new int[length];
//        for (int i = 0; i < length; i++) {
//            System.out.print("배열의 " + i + "번째 원소를 입력하세요 (0 이상 1,000,000 이하): ");
//            array[i] = scanner.nextInt();
//        }
//
//        // 쿼리의 개수 입력 (1 ≤ queries의 길이 ≤ 1,000)
//        System.out.print("쿼리의 개수를 입력하세요 (1 이상 1,000 이하): ");
//        int queryCount = scanner.nextInt();
//        int[][] queries = new int[queryCount][2];
//
//        // 쿼리의 각 시작 및 끝 인덱스 입력 (0 ≤ s ≤ e < arr의 길이)
//        for (int i = 0; i < queryCount; i++) {
//            System.out.print("쿼리의 " + i + "번째 시작 인덱스를 입력하세요 (0 이상 " + (length - 1) + " 이하): ");
//            queries[i][0] = scanner.nextInt();
//
//            System.out.print("쿼리의 " + i + "번째 끝 인덱스를 입력하세요 (" + queries[i][0] + " 이상 " + (length - 1) + " 이하): ");
//            queries[i][1] = scanner.nextInt();
//        }
//
//        Solution solution = new Solution();
//        int[] result = solution.solution(array, queries);
//        System.out.println("결과: " + Arrays.toString(result));
//    }
//
//    public int[] solution(int[] array, int[][] queries) {
//        for (int[] query : queries) {
//            int start = query[0];
//            int end = query[1];
//
//            for (int i = start; i <= end; i++) {
//                array[i]++;
//            }
//        }
//
//        return array;
//    }
//}