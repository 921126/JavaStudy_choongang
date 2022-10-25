package day04;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@#$%"};
		
		//System.out.println(arr[0]);
		
		/*
		 * Math.random()을 이용해서 배열의 인덱스 범위(0~3) 까지 랜덤수를 만든다.
		 * 랜덤수를 배열의 index에 적용해서 출력된 단어가 한국어, 영어, 일본어, 알수없는언어
		 * 
		 * 인지 처리를해보자.
		 */
		
		int rNum = (int)(Math.random()*4);
		
		//랜덤값 활용방법
		System.out.println("선택된 단어:" + arr[rNum]);
		
		switch (rNum) {
		case 0:
			System.out.println(rNum + "은 한국어 입니다.");
			break;
		case 1:
			System.out.println(rNum + "은 영어 입니다.");
			break;
		case 2:
			System.out.println(rNum + "은 일본어 입니다.");
			break;
		case 3:
			System.out.println(rNum + "은 알수없는언어 입니다.");
			break;

		default:
			break;
		}
		
		
	}

}
