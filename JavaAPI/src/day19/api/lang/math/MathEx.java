package day19.api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		//소숫점 올림(첫째자리 기준)
		double d = Math.ceil(1.3);
		
		//소숫점 내림(첫째자리 기준)
		d = Math.floor(1.22);
		
		//소숫점 반올림
		d = Math.round(3.14);
		
		//루트값 구하기
		d = Math.sqrt(16);
		
		
		//절대값 구하기
		d = Math.abs(-4);
		
		//큰값
		int i = Math.max(5, 3);
		
		System.out.println(d);
		System.out.println(i);
	}
	
}
