package day09;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열 다루기
//		String str = new String(new char[] {'A', 'B', 'C'});
//		System.out.println(str);
		
		String str = "안녕하세요~";
		
		//문자열의 길이 확인
		System.out.println(str.length());
		int len = str.length();
		System.out.println(len);
		
		//문자열을 한글자 자르기
		char c = str.charAt(0);
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf(처음부터) / lastIndexOf(뒤부터)
		int a = str.indexOf("녕");
		System.out.println("찾은위치:" + a);
		int b = str.lastIndexOf("녕");
		System.out.println("찾은위치:" + b);
		int d = str.indexOf("sdf");
		System.out.println("찾는 문자가 없다면:" + d);
		
		//문자열 변경 - replace 
		String e = str.replace("안", "헐"); //안 > 헐(전부다)
		System.out.println(e);
		
		
		//대문자 변경 
		str = "abcDeFg";  
		String f = str.toUpperCase();
		System.out.println(f);

		
		//문자열의 공백제거
		str = "     010-1234-5678     ";
		String g = str.trim();
		System.out.println(g);
		
		str = " 안 녕 하 세 요  개 천 절 날 은 쉽 니 다   "; 
		String h = str.trim();
		System.out.println(h); //앞뒤만 제거하고 사의 공백은 존재
		
		String i = str = str.replace(" ", "");
		System.out.println(i); //모든 공백 제거
		
		//String.valueOf() -> 기본타입을 문자로 변경
		System.out.println(String.valueOf(10)+20);
		
		//문자열 자르기★
		
		//substrings(인덱스 기준으로 자르고 싶은 부분만) 인덱스 미만 절삭
		str = "010-1234-5678";
		String j = str.substring(3);
		System.out.println(j);
		
		String k = str.substring(3, 5); //인덱스 이상 ~ 인덱스 미만 추출
		System.out.println(k);
		
		//split(문자열 전체 분할하여 string 배열에 담아줌)
		String[] arr = str.split("-"); //str.split("");
		System.out.println(Arrays.toString(arr));
		
		//toCharArray(문자열을뜯어 char형태로 배열에 담아줌)
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
	
	}
	
	
}

