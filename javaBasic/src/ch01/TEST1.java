package ch01;

import java.util.Scanner;

public class TEST1 {

	public static void main(String[] args) {
		 
		    // 제어문: 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
		
		    // 조건문: 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않음
		
		    // if: 주어진 조건이 true이면 코드를 실행하도록 하는 것
		    // if (조건-논리표현식) { 실행할 코드}
		    int age = 18;
		    // age는 17보다 크거나 같으면서 19보다 작거나 같아야한다.
		    // age >= 17 && age <= 19
		
		    // age는 17보다 크거나 같거나 19보다 작거나 같아야한다.
		    // age >= 17 || age <= 19
		
		    // 부정연산자: 논리 표현식을 부정하는 연산
		    // !논리; 논리가 true면 false, false면 true를 반환
		    boolean isHighSchool = age >= 17 && age <=19;
		    if (isHighSchool) {
			System.out.println("고등학생이 아닙니다.");
		    }
		
		    System.out.println("프로그램 종료");
		
            System.out.println("=================================================");
            System.out.println("=================================================");
            // else: if 문의 조건-논리표현식이 false면 코드를 실행하도록 하는 것
            // if (조건-논리표현식) { true이면 실행할 코드}
            // else {false이면 실행할 코드}
            
            // 1. else문은 반드시 if문 이후에 와야함 (else 단독으로 사용이 불가능)
            
            // 2. else문에는 조건을 작성하지 않음
            age = 20;
            
            if (age >19) {
            	System.out.println("성인입니다.");
            }
            else {System.out.println("미성년자입니다.");
            }
            
            System.out.println("프로그램 종료");
          
            //
            
            String fruit = "수박";
            if (fruit.equals("사과")) {
            	
            } else if (fruit.equals("바나나")) {
         	
            }
            else if (fruit.equals("귤")) {
            	
            }else { 
            
            }
            
            // switch: 특정 변수 또는 값에 따라 실행할 코드 블록의 범위를 결정하는 것
//            switch (변수-일반표현식) {
//            case 값1:
//            	 변수-일반표현식이 값1과 같을때 시작할 코드 위치
//            case 값2:
//           	 변수-일반표현식이 값2과 같을때 시작할 코드 위치
//           	 switch 내부에서 break문을 만나면 switch문을 종료
//           	 break;
//            case 값3:
//           	 변수-일반표현식이 값3과 같을때 시작할 코드 위치
//           	default: 변수-일반표현식이 case의 값과 일치하는 것이 없거나 바로 위에서 break문을 만나지 않으면 실행되는 코드
//            }
           	
            int input = 5;
            // input이 0이면 ABC를 출력
            // input이 1이면 BC
            // input이 2이면 C
            // input이 3이면 DEF
            // input이 4이면 EF
            // input이 0-4가 아니면 F
            
            switch (input) {
            case 0: 
            	System.out.println("A");
            case 1:
            	System.out.println("B");
            case 2:
            	System.out.println("C");
            	break;
            case 3:
            	System.out.println("D");
            case 4:
            	System.err.println("E");            	
            default:
            	System.out.println("F");
            }
            
            // input이 0이면 A를 출력
            // input이 1이면 B 
            // input이 2이면 C
            // input이 3이면 D
            // input이 4이면 E
            // input이 0-4가 아니면 F
            switch (input) {
            case 0: 
            	System.out.println("A");
            	break;
            case 1:
            	System.out.println("B");
            	break;
            case 2:
            	System.out.println("C");
            	break;
            case 3:
            	System.out.println("D");
            	break;
            case 4:
            	System.err.println("E");
            	break;
            default:
            	System.out.println("F");
            }
            System.out.println("=================================================");
            System.out.println("=================================================");
            
            // 반복문: 특정 조건에 부합하면 지정한 코드를 여러 번 실행하도록 하는 것
            // for: 일반적 반복 횟수가 정해져 있을 때 사용하는 반복문
            // for (조건에사용할변수초기화; 조건; 조건에사용할변수증감){반복할 코드}
            
//            System.out.println("안녕하세요");
//            System.out.println("안녕하세요");
//            System.out.println("안녕하세요");
//            System.out.println("안녕하세요");
//            System.out.println("안녕하세요");
//            System.out.println("안녕하세요");
            //...*100
            
            for (int count = 1; count <=3; count++) {
            	System.out.println("안녕하세요");
            }
            
            System.out.println("-1번 안녕하세요.");
            System.out.println("2번 안녕하세요.");
            System.out.println("5번 안녕하세요.");
            System.out.println("8번 안녕하세요.");
            System.out.println("11번 안녕하세요.");
            
            for (int count = 1; count <=5; count++) {
            	System.out.println((3*count-4) + "번 안녕하세요.");
            }
            
            System.out.println("================================");
            

	       }

}
