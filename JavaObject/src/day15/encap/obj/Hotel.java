package day15.encap.obj;

public class Hotel {	//사용자 클래스

	//	public String str = new String("dd");
	public Chef chef; // new Chef();

	//생성자 - 클래스를 받는 생성자
	public Hotel(Chef c) {
		this.chef = c;
	}
	//기본 생성자
	public Hotel() {
	} 
	
	
	//getter , setter 메서드
	public void sefChef(Chef c) {
		this.chef = c;
	}
	
	public Chef getChef() {
		return chef;
	}


}
