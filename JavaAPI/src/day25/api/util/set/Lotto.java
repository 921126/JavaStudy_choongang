package day25.api.util.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();

		//ArrayList 활용
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> nn = new ArrayList<>();
		
		//제외하고 싶은 숫자 정하기
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개 제외할래?>");
		int a = sc.nextInt();
		
		for(int i = 0; i <a; i++) {
			System.out.print("제외수 입력>");
			int b = sc.nextInt();
			nn.add(b);
		}
		sc.close();
		System.out.println(nn);
		
		//ArrayList의 size가 보다 작을때 까지 반복
		while(al.size() < 6) {
			//1~45 까지 숫자를 랜덤하기 추출
			int num = r.nextInt(45) + 1;

			//중복검사 실행
			if(al.contains(num) || nn.contains(num)) {
				continue;
			}
			al.add(num);
		}
		//정렬하기
		al.sort(null);
		System.out.println(al);
		
		
		//TreeSet 중복된 데이터를 저장하지 않고 저장된 순서를 기억한다.
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(treeSet.size() < 6) {
			//1~45 까지 숫자를 랜덤하기 추출
			int num = r.nextInt(45) + 1;

			treeSet.add(num);
		}
		for(Integer i : treeSet) {
			System.out.print(i + " ");
		}
	}
}
