package day02;

public class TypeInteger {

	public static void main(String[] args) {
		
		byte a = 127;
		byte b = -128;
		
		short c = 32767;
		short d = -32768;
		
		int e = 2147483647;
		int f = -2147483648;
		
		long g= 123456123546123L; //  그냥 작성시 빨같 밑줄 그어짐 꼭 맨 마지막에 L을 붙여야함.
		System.out.println(g);
		
		/*
		 * 변수에는 10진수가 아닌 다른 숫자도 저장이 가능하다.
		 * 2진수를 저장할때는  0b를 붙인다.
		 * 8진수를 저장할때는  0을 붙인다.
		 * 16진수를 저장할때는 0x를 붙인다.
		 */
		
		int bin = 0b1010;		//2진수
		System.out.println(bin);
		
		int octa = 064;
		System.out.println(octa);
		
		int hexa = 0xAC00;
		System.out.println(hexa);
		
		System.out.println("이진수 1010은: " + bin + "입니다."); //문자열과 변수를 함께 사용하고 싶다면 + 를 이용하자.
		System.out.println("팔진수 64는 " + octa + "입니다.");
		System.out.println("십육진수 AC00는 " + hexa + "입니다.");
		
		System.out.println("------------------------------------------------------");
		
		float f1 = 3.14f; //실수형 사용중 float을 사용할때는 꼭 f를 붙여야한다.
		double d1 = 3.14;
		
		float f2 = 3.1415923333F; //7자리까지 유효함
		double d2 = 3.1415923333; //15자리까지 유효함
		
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("------------------------------------------------------");

		//e표기법
		float f3 = 314.15e-2F;  // 10 -2승
		double d3 = 0.031415e2; // 10 2승
		
		System.out.println(f3);
		System.out.println(d3);
			
		System.out.println("------------------------------------------------------");
	
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
	
	}

}
