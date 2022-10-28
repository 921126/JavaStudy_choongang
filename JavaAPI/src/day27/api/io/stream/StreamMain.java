package day27.api.io.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalDouble;

public class StreamMain {
	
	public static void main(String[] args) {
		//숫자형태의 문자열 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("9");
		list.add("2");
		list.add("1");
		list.add("35");
		list.add("6");
		list.add("7");
		
		//최종 연산을 이용해서 출력
		//forEach는 매개변수 1개를 갖고 리턴이 없는 메서드를 매개변수로 받는다.
		//Collection의 모든 데이터를 매개변수에 대입해서 내용을 수행한다.
		
		//list안의 데이터를 순차적으로 e에 대입해서 {}안의 내용을 수행한다.
		//최종 작업만 수행해서 데이터 출력
		list.stream().forEach(e -> {System.out.print(e + " ");});
		
		System.out.println();
		
		//데이터 3개만 출력
		list.stream().limit(3).forEach(e -> {System.out.print(e + " ");});
		
		System.out.println();

		//데이터 오름차순 정렬 후 출력
		list.stream().sorted().forEach(e -> {System.out.print(e + " ");});
		
		System.out.println();
		
		//데이터 내림차순 정렬 후 출력
		list.stream().sorted(new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		}).forEach(e -> {System.out.print(e + " ");});
		
		System.out.println();
		
		//데이터 내림차순 정렬 람다이용한 출력
		list.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(e -> {System.out.print(e + " ");});
		
		System.out.println();

		//데이터를 정수로 변환해서 정렬하기
		/*
		 * 중간처리 메서드 중에 Int로 리턴해주는 mapToInt 라는 메서드가 존재하고
		 * 이 메서드를 사용할 때는 변환에 사용하는 메서드만 설정해주면 된다.
		 * 클래스이름::메서드 이름
		 */
		list.stream().
		map((o) -> {return Integer.parseInt(o);}).
		sorted((o1,o2) -> o2.compareTo(o1)).
		forEach(e -> {System.out.print(e + " ");});
		
		System.out.println();

		//정수변환 오름차순 정렬
		//숫자의 경우는 크기 비교가 가능해서 별도의 인스턴스를 대입하지 않아도 정렬됨.
		list.stream().mapToInt(Integer::parseInt).
		sorted().forEach(e -> {System.out.print( +e + " ");});
		System.out.println();

		//정수변환 내림차순 정렬
		//내림차순을 하고자 하는 경우는 revers 옵션 설정을 해주면된다.
		list.stream().map(Integer::parseInt).
		sorted(Comparator.reverseOrder()).
		forEach(e -> {System.out.print( +e + " ");});
		System.out.println();
		
		//문자열을 정수로 변환해서 합계 구하기
		int result = list.stream().mapToInt(Integer::parseInt).sum();
		System.out.println(result);
		
		
		
		//홀수의 합
		//filter : 조건에 맞는 데이터만 추출
		//조건에 맞는 추출하고자할때는 하나의 매개변수를 받아 boolean 리턴하는 람다를 만들어 대입.
		int result2 = list.stream().
				mapToInt(Integer::parseInt).
				filter(o -> o % 2 == 1).sum();
		System.out.println(result2);
		
		
		//홀수의 평균 구하기
		//일반적으로 생각하기에는 평균의 결과가 정수나 실수가 나와야하는데
		//자바에서는 OptionalDouble 이 된다.
		//Optional이 붙으면 null을 저장할 수 있는 자료형이 되며
		//isPresent라는 메서드를 이용해서 null 여부를 판단하고
		//get이라는 메서드로 데이터를 가져온다.
		OptionalDouble result3 = list.stream().
				mapToInt(Integer::parseInt).
				filter(o -> o %2 == 1).average();
		
		//연산을 정상적으로 수행한경우 : 데이터가 있음
		if(result3.isPresent()) {
			System.out.println(result3.getAsDouble());
		}else {
			System.out.println("평균 계산 실패 - 아마도 데이터가 없는 것 같음");
		}
		
		
		
		
		
	}
}
