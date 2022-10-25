package day02;

public class CastingEx02 {

	public static void main(String[] args) {

		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할때는 (type)캐스팅을 이용해서 명시적 형변환이 필요함.
		 */
		
		int i = 70;
		//char c = i;	int는 char로 변환할 수 없다는 오류 문구 출력
		
		char c =(char)i;
		short s = (short)i;
		
		System.out.println(c);

		double d = 3.14;
		
		int k = (int)d;
		float f = (float)d;
		
		System.out.println(k);
		
		/*
		 * 캐스팅시 주의할 점
		 * 1. 해당 값을 받을 수 없는 범위가 들어오면 잘려나간 값(쓰레기 값)이 저장된다. 
		 */
		int a = 1000;
		byte b = (byte)a;
		
		System.out.println(b);
		
		/*
		 * char 과 short는 크기가 같지만 문자형과 숫자형이므로 형변환이 필요하다.
		 */
		
		char cc ='a';
		short ss = (short)cc;
		
		System.out.println(ss);
		
		
		
	}

}
