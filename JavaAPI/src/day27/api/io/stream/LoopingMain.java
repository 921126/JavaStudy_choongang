package day27.api.io.stream;

import java.util.ArrayList;

public class LoopingMain {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("프로그래밍 언어");
		list.add("데이터 베이스");
		list.add("프레임워크");
		list.add("소프트웨어 공학");
		list.add("Toy Project");
		
		//전체 데이터 출력1. - 실행속도는 가장 빠르지만 list의 데이터 개수가 변경되면 수정해야함
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//전체 데이터 출력2. - 반복문을 이용해서 데이터 출력시 list의 데이터 개수가 변경되도 크게 수정할 필요 없음.
		for(int i =0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		//전체 데이터 출력3. 변하지 않는 메서드의 호출 결과를 반복문에서 여러 번 호출하는 것은 자원의 낭비
		int len = list.size();
		for(int i =0; i < len; i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();

		//전체 데이터 출력4. 모든 데이터를 순회하는 경우라면 빠른 열거를 이용하는 것이 효율적이다.
		for(String str : list) {
			System.out.print(str + " ");
		}
		
		System.out.println();

		//전체 데이터 출력5. 스트림 API를 이용한 내부 반복자 사용 **가장 빠름빠름
		list.stream().forEach(str ->{
			System.out.print(str + " ");
		});
		System.out.println();
	}

}
