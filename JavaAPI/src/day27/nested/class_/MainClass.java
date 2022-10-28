package day27.nested.class_;

import java.util.Arrays;
import java.util.Comparator;

//메서드가 1개인 인터페이스
interface Sample{
	//추상 메서드 선언
	public void display();
}

//인터페이스를 구현한 클래스
class SampleImpl implements Sample{

	public void display() {
		System.out.println("샘플 인터페이스를 클래스로 이동시켜 출력해버리기");
	}
}

public class MainClass {
	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		//인스턴스를 여러개 만들어야 한다면 클래스를 만드는 것이 효율적
		Sample sample = new SampleImpl();
		sample.display();
		
		
		//Sample 인터페이스를 anonymous로 사용
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는 것이 효율적이다.
		new Sample() {
			public void display() {
				System.out.println("클래스를 통하지 않아도 바로 사용가능!");
			}
		}.display();
		
		
		//배열의 정렬
		String[] arr = {"사과", "바나나", "딸기", "귤", "샤인머스켓", "홍시", "망고"};
		
		//배열의 내림차순 정렬
		//Arrays.sort(arr); (배열, 비교를 위한 Camparator<T> 인터페이스를 구현한 클래스의 객체
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}



