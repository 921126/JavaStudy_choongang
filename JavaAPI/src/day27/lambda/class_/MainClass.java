package day27.lambda.class_;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		String[] arr = {"사과", "바나나", "딸기", "귤", "샤인머스켓", "홍시", "망고"};

		/* 람다식
		 * - Comperator 인터페이스는 메서드가 1개 밖에 없으므로 람다로 표현하느 것이 가능하다.
		 * - 람다를 만들 때는 인터페이스 이름과 메서드 이름은 중요하지 않다.
		 * - 매개변수의 개수와 리턴 타입만 확인하면 된다.
		 */
		
		//매개변수는 2개이고 정수 타입은 정수
		Arrays.sort(arr,(o1, o2) -> {return o2.compareTo(o1);});
		Arrays.sort(arr,(o1, o2) -> o2.compareTo(o1));

		System.out.println(Arrays.toString(arr));
	}

}
