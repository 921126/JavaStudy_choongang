package day25.api.util.set;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClassCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		
		Set<String> hasSet = new HashSet<>();

		//샘플 데이터 삽입
		hasSet.add("오도도");
		hasSet.add("강아지");
		hasSet.add("귀여워");
		hasSet.add("내새끼");
		hasSet.add("뽀뽀쪽");
		
		//데이터 출력
		for(String str : hasSet) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		Set<String> linkedhashSet = new LinkedHashSet<>();

		//샘플 데이터 삽입
		linkedhashSet.add("오도도");
		linkedhashSet.add("강아지");
		linkedhashSet.add("귀여워");
		linkedhashSet.add("내새끼");
		linkedhashSet.add("뽀뽀쪽");

		//데이터 출력
		for(String str : linkedhashSet) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		Set<String> treeSet = new TreeSet<>();
		
		//샘플 데이터 삽입
		treeSet.add("오도도");
		treeSet.add("강아지");
		treeSet.add("귀여워");
		treeSet.add("내새끼");
		treeSet.add("뽀뽀쪽");
		
		//데이터 출력
		for(String str : treeSet) {
			System.out.print(str + "\t");
		}
		System.out.println();
	
	}
}
