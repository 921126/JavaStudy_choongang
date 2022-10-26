package day15.poly.basic2;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		//다향성을 적용한 배열
		//1. 객체 선언
		Student s = new Student("홍길동",20,"123123");
		Teacher t = new Teacher("홍길자",30,"프로그램");
		Employee e = new Employee("홍길순",40,"취업지원팀");
		
		//2. 부모 클래스 배열에 담기
		Person[] arr = {s,t,e};
		
		//3. 실행 : 정보 불러오기
		//불러오기 1 - 향상된 for문 이용
		for(Person p : arr) {
			System.out.println(p.info());//오버라이딩 된 메서드
		}
		
		//불러오기 2 - 부모타입을 매개변수로 받는 메서드 이용
		printInfo(s);
		printInfo(t);
		printInfo(e);

	
		//실습
		
		//1. 객체 선언
		House h = new House();
		
		//2. 정보 넣기
		h.setPerson(s); //스튜던트
		h.setPerson(t); //티쳐
		h.setPerson(e); //임플로이
		
		//3.배열확인
		Person[] ar = h.getArr();
		System.out.println(Arrays.toString(ar));
		for(Person p : ar) {
			if(p == null) break;
			System.out.println(p.info()); //오버라이딩된 메서드
		}
	}

	//메서드
	public static void printInfo(Person p) { //부모타입 매개변수
		System.out.println(p.info());
	}
}
