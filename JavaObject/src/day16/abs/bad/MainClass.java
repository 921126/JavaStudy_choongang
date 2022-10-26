package day16.abs.bad;

public class MainClass {
	
	public static void main(String[] args) {
		SeoulStore ss = new SeoulStore();
		ss.apple();		//재정의(오버라이딩) O
		ss.melon();		//재정의(오버라이딩) O
		ss.orange();	//재정의(오버라이딩) X > 재정의가 안되었다면 잘못된 메서드가 실행될 수 있다.
	}
}
