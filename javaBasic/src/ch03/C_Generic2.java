package ch03;

import java.util.List;

// 제너릭: 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법

// Test1, Test2 형태로 클래스를 사용하게되면 코드의 중복이 발생함
class Tester1 {
	String subject;
	int score;
}
class Tester2 {
	String subject;
	String score;
}

// Test3 형태로 클래스를 사용하게되면 타입의 안전성 떨어짐
class Tester3 {
	String subject;
	Object score;
}

// 제너릭 클래스: 클래스 내부에 있는 데이터 타입을 외부에서 받아오려 할 때 사용
// class 클래스명<매개타입> { 매개타입 변수명;...}
class Tester4<T> {
	String subject;
	T score;
}

class Tester5 {
	
	// 제너릭 메서드 : 해당 메서드의 매개변수의 타입이나 반환 타입에서 사용할 타입을 외부에서 받아오려 할 때 사용
	// <매개타입> 반환타입 메서드명(<매개타입> 매개변수) {...}
	static <T> void method (List<T> arg) {
		System.out.println(arg);
	}
	// ? : 와일드 카드로 제너릭에 대해서 모든 타입을 받을 수 있도록 함
	static void wildCardMethod(List<?>arg) {
		System.out.println(arg);
	}
	// ? extends 클래스명 : 특정 클래스 혹은 특정 클래스를 확장한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인클래스 또는 자손클래스)
	static void extendMethod(List<? extends MyClass22> arg ) {
		System.out.println(arg);
	}
	// ? super 클래스명 : 특정 클래스 혹은 특정 클래스가 확장한 클래스만 제너릭으로 받을 수 있도록 제한함
	// (본인클래스 또는 조상클래스)
	static void superMethod (List<? super MyClass22> arg) {
		System.out.println(arg);
	}
    
}

class SuperClass22 {
	
}

class MyClass22 extends SuperClass22 {
	
}

class SubClass22 extends MyClass22 {
	
}

public class C_Generic2 {

	public static void main(String[] args) {		 
			
			Tester3 myTest = new Tester3();
			myTest.subject = "국어";
			myTest.score = 95;
			
			Tester3 yourTest = new Tester3();
			yourTest.subject = "경영학원론";
			yourTest.score = "A+";
			
//			myTest.score
			
			Tester4<Integer> hisTest = new Tester4<>();
			hisTest.score = 95;
//			hisTest.score = "A+";
			
			Tester4<String> herTest = new Tester4<>();
			herTest.score = "A+";
			
			hisTest.score++;

	}

}
