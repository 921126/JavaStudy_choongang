package day16.abs.bad;

public class Store { //부모 클래스 - 메뉴 생성
	
	//추상 사용X
	public void apple() {System.out.println("자식에서 재정의 하세요");}
	public void melon() {System.out.println("자식에서 재정의 하세요");}
	public void orange() {System.out.println("자식에서 재정의 하세요");}
}
