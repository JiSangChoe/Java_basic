package ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class B_Package {

	public static void main(String[] args) {
		
		// Wrapper 클래스: 기본형 데이터 타입을 참조형 데이터 타입으로 다룰 수 있도록 하는 클래스
		// 일반적으로 기본형 데이터타입의 풀네임에 첫글자를 대문자로 지정하면 Wrapper 클래스가 됨
		Integer wrapperInt = 10;
		Double wrapperDouble = 10.0;
		Boolean wrapperBoolean = false;
		String wrapperString = "String";
		
		// 자주 사용하는 기능
		// parse 메서드: 문자열을 특정 타입으로 변환
		int number = Integer.parseInt("123");
		System.out.println(number);

		// toSring 메서드: 특정 타입의 값을 문자열로 변환
		String string = Integer.toString(123);
		System.out.println(string);
		
		System.out.println("================================================");

		// Collection Framework : java 에서 데이터 구조에 대한 표준화된 기법을 제공
		// Java에서 데이터를 저장, 검색, 수정, 삭제하기 위한 표준화된 방법을 제공하는 클래스와 인터페이스의 집합이다. 
		// List, Set, Queue, Map 등 다양한 데이터 구조를 제공
		
		//! List: 데이터를 저장할 때 중복 허용하고 순서가 존재함 --> 배열의 길이만 고정되어있지 않다
		List<Integer> arrayList; // => int[] arrayList; 
		//--> Integer 를 Object 로 바꾸면 arrayList.add 가 모든 타입의 매개변수를 받을 수 있음

		// 구현체 : ArrayList, LinkedList
		// *ArrayList(구현체): List 중에서 내부 배열을 사용하여 인덱스를 사용한 검색이 빠름 // 가장 많이 사용 99.999%
		arrayList = new ArrayList<>(); // 길이가 0짜리인 배열이 생성됨
		// LinkedList: 이중 연결 기법을 사용하여 추가, 삭제가 빠름
		//arrayList = new LinkedList<>();
		
		// 기능(메서드) : add(), get(), set(), remove(), size()  등
		// add(): List 에 요소를 추가
		// 추가할 요소의 데이터 타입은 반드시 제너릭으로 지정한 타입으로만 추가 가능
		arrayList.add(10); // 길이가 1개 자리인 배열의 첫번째 값이 10이 들어가 있다.
		// arrayList.add("aaa");
		System.out.println(arrayList);
		
		// get(): List 의 특정 인덱스 요소에 접근 
		// List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
		// 기본형 데이터타입의 변수로 반환값을 받을 경우 null 값을 받을 수 있음을 주의
        int arrayElement = arrayList.get(0); // 0번 인덱스값을 가져오겠다.
        System.out.println(arrayElement);
        
        arrayList.add(20);
        arrayList.add(30);
        
        System.out.println(arrayList);
        
        // set(): List 의 특정 인덱스 요소를 변경
        // List 인덱스 범위를 초과하는 인덱스를 지정할 수 없음
        arrayList.set(1, -99);
        System.out.println(arrayList);
        
        // remove(): List 의 특정 요소를 삭제
        arrayList.remove(2); // 3번째에 있는 2번 인덱스 제거함
        System.out.println(arrayList);
        
        // size(): List 의 길이를 반환
		System.out.println(arrayList.size());
		
	    System.out.println("================================================");
		
		//! Set: 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않음 (요소의 집합)
		Set<String> set;

		// 구현체 : HashSet, LinkedHashSet, TreeSet
		// HashSet: 해싱 기법을 사용해서 검색 속도가 빠름
		//set = new HashSet<>(); // 3개이상할 때 랜덤하게 출력. 단, 같은 값은 한번만 출력
		// LinkedHashSet:  추가한 순서대로 요소를 관리
		// TreeSet: 요소를 정렬해서 추가
		set = new TreeSet<>(); // 정렬값이 나옴
		
		// 기능(메서드) : add(), remove(), contains() 등
		// add(): Set 에 요소를 추가. 단, 동일한 요소가 이미 추가되어 있다면 추가하지 않음
		set.add("Banana");
		System.out.println(set);
		set.add("Apple");
		System.out.println(set);
		set.add("Banana1");    
		System.out.println(set); // 중복된 값이라 추가가 안됨
		
		// remove(): Set에서 특정 요소를 제거
		// 제거하고자 하는 요소가 없더라도 예외가 발생하지 않음
		set.remove("Apple");
		System.out.println(set);
		
		// contains(): Set 에서 특정 요소가 존재하는지 확인
		set.contains("Apple");
		System.out.println(set.contains("Banana"));
		
		System.out.println("================================================");
		
		//! Map: 키와 값이 한쌍으로 이루어진 요소들의 집합, 키는 중복 불가능, 값은 중복 가능
		Map<String, String> map; // -> String 으로 지정했기 때문에 정수형 등등 올 수 없음

		// 구현체 : HashMap, LinkedHashMap, TreeMap
		// HashMap: 해싱기법으로 키의 검색 속도가 빠름 -> map = new HashMap<>();
		// LinkedHashMap: 추가한 순서 또는 마지막에 접근한 순서대로 요소를 관리
		// TreeMap: 키를 정려하여 저장
		map = new TreeMap<>();
		
		// 기능(메서드) : put(), get(), remove(), containsKey() 등
		// put() : Map 에 키와 값을 추가
		// 만약 동일한 키가 존재한다면 해당 키의 값을 변경 -> add와 차이점(추가하는것)
        map.put("Apple", "사과");
        System.out.println(map);
        map.put("Banana", "바나나");
        System.out.println(map);
        map.put("Apple", "링고");
        System.out.println(map);
        map.put("Banana1", "바나나");
        System.out.println(map);
        
        // get(): Map 에서 특정 키를 가지는 요소를 반환
        // 존재하지 않는 키를 검색할 경우 null 을 반환
        System.out.println(map.get("Apple"));
        
        // remove(): Map 에서 특정 키를 가지는 요소를 제거
        // remove 작업에 성공하면 해당 키의 값을 반환
        // map.remove("Apple");
        System.out.println(map.remove("Apple"));
        
        //Ex
        class Human {
        	String name;
        	String address;
        	int age;
        }
        
        Human human1 = new Human();
        human1.name = "홍길동";
        human1.address = "부산광역시 진구";
        human1.age = 10;
        // name="홍길동"
        // address="부산광역시 진구"
        // age = 10
        Map<String, Object> human2 = new HashMap<>();
        human2.put("name", "홍길동");
        human2.put("address", "부산광역시 진구"); 
        human2.put("age", "열살");
        
        // 1.문제점 : 사용 혹은 추가할때 오타(실수)에 대한 가능성
        human2.get("nmea");
        // 2.문제점 : 타입의 안정성의 문제
        Integer age = (Integer) human2.get("age");

		
	}

}
