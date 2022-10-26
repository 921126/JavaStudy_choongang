package day17.inter.default_;

public class MainClass {
	public static void main(String[] args) {
		
		MyInter i = new MyClass();
		i.some1();						//오버라이딩 메서드 실행
		i.some2();						//defualt 메서드
		MyInter.some3(); 				//static 메서드
		System.out.println(MyInter.PI); //상수
		
	}
}
