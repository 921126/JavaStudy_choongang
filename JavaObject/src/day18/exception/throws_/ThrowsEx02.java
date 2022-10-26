package day18.exception.throws_;

public class ThrowsEx02 {

	//생성자
	public ThrowsEx02() throws Exception{
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
	
	//메서드
	public void aaa() throws Exception {
		System.out.println("aaa 시작");
		bbb(1);
		System.out.println("aaa 종료");
	}
	
	public void bbb(int i) throws Exception {
		System.out.println("bbb 시작");
//		try {
//			System.out.println(i/0); //예외
//		} catch (Exception e) {}
		
		System.out.println(i/0); //예외
		System.out.println("bbb 종료");
	}

}
