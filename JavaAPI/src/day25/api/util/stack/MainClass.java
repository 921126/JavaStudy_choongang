package day25.api.util.stack;

import java.util.Date;
import java.util.Stack;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 Stack 생성
		Stack<PersonVO> stack = new Stack<>();
		
		//stack 데이터 저장하기
		stack.push(new PersonVO(1, "장원영", "여자", new Date(100,3,11), "01000000001"));
		stack.push(new PersonVO(2, "기리보이", "남자", new Date(100,3,11), "01000000002"));
		stack.push(new PersonVO(3, "김민니", "여자", new Date(108,5,28), "01000000001"));

		//stack 데이터 꺼내기 -> 마지막에 넣은 데이터 순서(데이터 입력 내림차순..?)대로 출력됨
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//스택이 비어있는 경우 호출시 underflow 발생
//		System.out.println(stack.pop()); 
	}
}
