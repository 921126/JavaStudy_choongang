package day15.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//다향성X
		Child c = new Child();
		c.method01(); //상속받은 내용
		c.method02(); //상속받아 오버라이드 내용
		c.method03(); //원래 자식의 메소드
		
		//다향성O > 잠깐 형변환을 해주는 것!
		System.out.println("= = = 다향성 = = =");
		/*
		 * 자식이 부모에 저장되는데, 부모님 처럼 사용되지만 
		 * 오버라이딩 했을 경우 자식의 오버라이딩 된 메서드가 실행된다.
		 * 
		 */
		Parent p = c; //Parent = new Chile();
		p.method01(); //상속받은 내용
		p.method02(); //상속받아 오버라이드 내용
		
		System.out.println( p == c); //동일한 주소값을 나타냄
		
		
		System.out.println("= = = 클래스 캐스팅 = = =");
		//다향성이 적용되면, 자식이 가지고 있던 원래 본래의 기능을 사용 할 수 없기
		//때문에 클래스 케스팅을 사용한다.
//		Child cc = p;// 자식 클래스는 부모 클래스 저장 및 캐스팅 불가능
		Child cc = (Child)p; //가능
		cc.method01();
		cc.method02();
		cc.method03();
		
		System.out.println("= = = 주의 할 점 = = =");
		//다형성이 적용된 객체만 캐스팅이 가능하다.
		Parent pp = new Parent();
//		Child ccc =(Child)pp; //error 불가능
		
		
		
		
	}
}
