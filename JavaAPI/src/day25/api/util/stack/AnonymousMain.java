package day25.api.util.stack;

interface Starcraft{
	public void attack();
}

//인터페이스를 구현한 클래스 생성
class Protoss implements Starcraft{

	@Override
	public void attack() {
		System.out.println("드!");
		System.out.println("라!");
		System.out.println("군!");
	}
}

public class AnonymousMain  {
	
	public static void main(String[] args) {
		
		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Protoss pt = new Protoss();
		pt.attack();
		
		//인터페이스를 implements 한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		Starcraft z = new Starcraft() {
			public void attack() {
				System.out.println("저글링 끽끽");
			}
		};
		z.attack();
		
		
		
		Starcraft star = new Protoss();
		star.attack();
		
		star = new Starcraft() {
			
			public void attack() {
				System.out.println("저그의 공격");
			}
		};
		
		star.attack();
		
		//변수를 만들지 않고 인스턴스만 생성해서 메서드 사용하는 방법 : 익명객체
		new Starcraft() {
			public void attack() {
				System.out.println("마린의 땅땅땅빵!");
			}
		}.attack();
		
		
		
	}
}
