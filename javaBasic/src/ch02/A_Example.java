package ch02;

// GalaxyPhone

// 제조사: (maker - String)
// 모델명: (modelName - String)
// 소유자: (owner - String)
// 전화번호: (telNumber - String)
// 전원상태: (power - boolean)

// 전원버튼누름: onPower - power 상태를 부정
// 전화걸기: call - power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기: emergency - power가 true일 때 "112로 전화를 겁니다." 출력
// 휴대전화정보보기: getInformation - power가 true일 때
//
// ===== (전화번호) =====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)
//
// 출력

class GalaxyPhone {
	static String maker;
	String modelName;
	String owner;
	String tellNumber;
	boolean power;
	
	void onPower ( ) {
		power = !power;
	}
	void call (String toTellNumber) {
		if (!power) return;
		System.out.println(toTellNumber + "로 전화를 겁니다.");
	}
	
	static void emergency ( ) {
		System.out.println("112로 전화를 겁니다");
	}
	
	void getInformation() {
		if (!power) return; 
			System.out.println("====" + tellNumber + "=====");
			System.out.println("제조사 : " + maker);
			System.out.println("모델명 : " + modelName);
			System.out.println("소유자 : " + owner);					
	}
}


// Drama
// 방송사: (boardcastingCompany - String)
// 제목: (title - String)
// 배우: (actors - String[])
// 장르: (genre - String)
// 시청률: (viewerRating - double)
// 부작: (series - int)

// 정보보기: getInfomatin
// =====(title)=====
// 방송사 : (boardcastingCompany)
// 장르 : (genre)
// 부작 : (series)부작
// 시청률 : (viewerRating)%
// 배우 : (actor), (actor), (actor)...     전지현, 김수현, 박해진, 유인나

class Drama {
	String boardcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRating;
	int series;
	
	void getInformation() {
		System.out.println("=====" + title + "=====");
		System.out.println("방송사 : " + boardcastingCompany);
		System.out.println("장르 : " + genre);
		System.out.println("부작 : " +series);
		System.out.println("시청률 : " + viewerRating);
		System.out.print("배우 : ");
		for (int index = 0; index < actors.length; index++) {
			//System.out.println(actors[index] + ", ");
			// {"A", "B", "C"}
			//if (index < actors.length - 1) System.out.println(", ");
			
			// index < actors.length - 1 
			// true - actors[index] + ", "/ false - actors[index]
			String actor = index < actors.length - 1 ? actors[index] + ", " : actors[index]; 
			System.out.print(actor);
		}
		System.out.println("");
	}

}

// TriangleMath
// 빗변 구하기 - getHypotenuse
// 둘레 구하기 - getCircumference
// sin 구하기 - getSin
// cos 구하기 - getCos
// tan 구하기 - getTan

class TriangleMath {
	
	//static final double PI = 3.14;
	
	//Math.pow(xx, 몇번 곱할지) --> 제곱표현 , Math.sqrt--> 루트씌우기
	static double getHypotenuse (int bottom, int height) {
		if (bottom <= 0 || height <= 0) return 0;
		// if (!(bottom > 0 && height > 0)) 
			
		double result = Math.pow(bottom, 2) + Math.pow(height, 2);
		return Math.sqrt(result);
	}
	
	static double getCircumference (int height, int bottom, int hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse;
	}
	
	static double getSin(int height, int hypotenuse) {
		if (height <= 0 || hypotenuse <= 0) return 0;
		return height / hypotenuse;
	}
	
	static double getsCos(int bottom, int hypotenuse) {
		if (bottom <= 0 || hypotenuse <= 0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if (bottom <= 0 || height <= 0) return 0;
		return height / bottom;
	}
	
}

public class A_Example {

	public static void main(String[] args) {
		GalaxyPhone s23 = new GalaxyPhone(); // --> 클래스 이름과 동일한 메서드 = 생성자
		GalaxyPhone s24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";
		
		//s23.maker = "SAMSUNG";
		s23.modelName = "s23";
		s23.owner = "홍길동";
		s23.tellNumber = "010-1234-5678";
		s23.power = false;
		
		//s24.maker = "SAMSUNG";
		s24.modelName = "s24";
		s24.owner = "김철수";
		s24.tellNumber = "010-5678-1234";
		s24.power = false;
		
		s23.onPower();
		s23.getInformation();
		
		GalaxyPhone.emergency();
		s23.emergency();
		s24.emergency();
		
		Drama star = new Drama(); // -> new Drama는 인스턴스, Drama star는 참조 변수
		star.boardcastingCompany = "SBS";
		star.title = "별에서 온 그대";
		star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"};
		star.genre = "로맨스";
		star.viewerRating = 28.1;
		star.series = 21;
		
		star.getInformation(); //이거 ()가 있어서 메서드임 없으면 변수로 생각
		
		TriangleMath triangleMath = new TriangleMath();
		double bit = TriangleMath.getHypotenuse(3, 4);
		System.out.println(bit);
		
		//System.out.println(TriangleMath.PI);
		//TriangleMath.PI = 0.0; --> 이미 위에서 static 변수로 고정을 했기 때문에
		// 단일 책임 원칙이 지켜지지 않음 => 문법적으로 틀리지는 않지만 불편하다고함
				
		}

	}


