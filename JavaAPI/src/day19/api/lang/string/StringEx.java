package day19.api.lang.string;

import java.util.Arrays;

public class StringEx {
	
	public static void main(String[] args) {
		
		String s = "홍길동";
		
		//인덱스 번호에 맞는 글자 출력
		System.out.println(s.charAt(0));
		
		//문자 찾으면 문자의 인덱스 반환, 못찾으면 -1
		System.out.println(s.indexOf("홍"));
		
		//원하는 문자를 원하는 문자로 변경
		//원본 문자는 유지가 되며, 변경되지 않는다.
		System.out.println(s.replace("홍", "길"));
		System.out.println(s);
		
		//인덱스 앞의 내용을 절삭함
		String s2 = "오늘은 날씨가 추워요";
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(4, 7));
		
		//앞뒤 공백 제거
		System.out.println("    홍홍홍  ".trim());
		
		//문자열 string 배열형으로 자르기
		String[] arr = s2.split(" ");
		System.out.println(Arrays.toString(arr));
		String[] arr2 = "010-1234-5678".split("-", 2);
		System.out.println(Arrays.toString(arr2));
		
		//글자포함 확인
		if(s.contains("홍")) {
			System.out.println("홍이 있슈");
		}

		//배열값 합쳐서 출력
		System.out.println(String.copyValueOf(new char[] {'a', 'b', 'c'}));
		//문자열을 number 객체형으로 변환하여 반환
		System.out.println(String.valueOf("a"));
		
		
	}

}
