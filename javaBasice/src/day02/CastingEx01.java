package day02;

public class CastingEx01 {

	public static void main(String[] args) {

		//** 자동형변환
		
		byte b = 10;
		
		int s = b;		//byte -> int형으로 자동형변환
		short i = b;	//byte -> short형으로 자동형변환
		long l = b;		//byte -> long형으로 자동형변환
		
		char c ='가';
		int j = c;		//char -> int형으로 자동형변환
		
		System.out.println(c);
		System.out.println("가의 유니코드 숫자값:" + j);
		
		int k = 1000;	//int ->double로 변환
		double d = k;
		
		System.out.println(d);
		
	}

}
