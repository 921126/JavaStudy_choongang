package day01;

public class VariableScope {

	public static void main(String[] args) {

		// 같은 자료형일 경우 ,(콤마)를 이용해 한번에 선언 가능하다.
		int num1 = 10, num2 = 20;
		int num4 = 0; //초기값
		
		if(true) {

			int num3 = num1 + num2; //중괄호 안에 만들어진 변수값은 중괄호 밖에선 사라진다.

			System.out.println(num3);
			num4 = 200; //변경 가능 
		}
		// System.out.println(num3); 
		// 해당 중괄호 안에  num3이 위치하지 않기 때문에 빨간 밑줄이 나온다.
		// main안에서 만들어진 변수를 지역변수라고 부른다. **지역변수 공부 필요 

		int num3 = 100;
		System.out.println(num3);
		System.out.println(num4); //위에서 0으로 선언을하고 안에서 200으로 변경을하여 값을 뽑아냄.
	}
}
