package day16.static_var;

public class MainClass {
	
	public static void main(String[] args) {
		
		//객체생성
		Count c1 = new Count();
		
		//일반변수 및 정적변수 값 변경
		c1.a++;
		c1.b++;
		
		//현재 값 확인
		System.out.println("일반 변수:" + c1.a);
		System.out.println("정적 변수:" + c1.b);
	
		//비교를 위한 신규 객체 생성
		Count c2 =  new Count();
	
		//일반 변수 및 정적변수 값 변경
		c2.a++;
		c2.b++;
		
		//값 확인
		System.out.println("일반 변수:" + c2.a);
		System.out.println("정적 변수:" + c2.b);
		
		
		Count c3 = new Count();
		
		c3.a++;
		c3.b++;
		
		System.out.println("일반 변수:" + c3.a);
		System.out.println("정적 변수:" + c3.b);
		
		//현재 c1.b의 값은? 3
		//현재 c2.b의 값은? 3
		
		//static은 객체 생성없이 바로 접근가능하다.
		//(클래스명).static 변수로 사용
		Count.b++;
		System.out.println("바로 접근한 정적 변수:" + Count.b);
		
		
		
	}

}
