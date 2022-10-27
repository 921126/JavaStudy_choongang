package day25.api.util.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import day25.api.util.stack.PersonVO;

public class MainClass {

	public static void main(String[] args) {
		//priorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 하는 클래스이다.
		//변수명.poll() 짝궁으로 사용한다.
		
		//정수를 저장하는 priorityQueue를 만들어서 출력
		PriorityQueue<Integer> intq= new PriorityQueue<>();
		
		//데이터 정렬해서 저장
		intq.offer(8);
		intq.offer(2);
		intq.offer(5);
		intq.offer(1);
		System.out.println(intq);
		
		//큐 맨앞 데이터 값 정렬해서 삭제하면서 꺼내기
		System.out.println(intq.poll());
		System.out.println(intq.poll());
		System.out.println(intq.poll());
		System.out.println(intq.poll());
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		//persons.offer(new PersonVO(1, "오하영", "여자", new Date(1992,11,26), "01000000001"));
		//persons.offer(new PersonVO(2, "오세영", "여자", new Date(1992,05,28), "01000000002"));
		
		//이 상태에서 만들면 PersonVO의 크기를 비교할 수 없기 때문에 예외 발생
		//System.out.println(persons.poll());
		
		//PersonVO클래스에 Comparable 인터페이스를 implements하고 compareTo라는 메서드를 재정의하거나
		//Comparator 인터페이스를 대입 받을 수 있는 경우에는 Comparator 인터페이스를 구현한 클래스의 인스턴스를 이용해서 생성해도 되다.
		
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			//번호 내림차순으로 정렬한다.
			public int compare(PersonVO o1, PersonVO o2) {
				return (int) (o2.getNum() - o1.getNum());
			}
		});
		
		persons.offer(new PersonVO(1, "오하영", "여자", new Date(1992,10,26), "01000000001"));
		persons.offer(new PersonVO(2, "오세영", "여자", new Date(2000,04,28), "01000000002"));
		persons.offer(new PersonVO(3, "오도도", "남자", new Date(2018,02,10), "01000000003"));
		
		//내림차순으로 정렬된 정보 출력
		System.out.println(persons.poll());
	}
}
