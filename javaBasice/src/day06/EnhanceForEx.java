package day06;

public class EnhanceForEx {
	
	public static void main(String[] args) {
	
		//일반 for문 이용하는 방법		

		int[] arr = {1,2,3,4,5};
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(i); 		//인덱스값 출력
//			System.out.println(arr[i]); //데이터 값
//		}
		
		//향상된for문 이용하는 법
		for(int a: arr) {
			System.out.println(a); 		//데이터값 출력
		}
		
		System.out.println("--------------------");
		
		String[] sArr = {"월", "화", "수", "목", "금", "금", "금"};
		for(String s : sArr) {
			
			System.out.println(s);
		}
		
		System.out.println("--------------------");
		
		//배열 요소들의 합계와 평균을 소수 2자리만 출력
		
		int[] score = {34,54,23,53,65};
//		double sum = 0;	//합계용 변수
//		
//		for(double d : score) {
//			sum += d;					//합계 구하기
//		}
//		double average = sum / score.length;
//		System.out.println(sum);
//		System.out.println(average);
		
		//쌤코드
		
		int sum =0;
		for(int i : score) {
			sum+=i;
		}
		
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/score.length);
		//System.out.println("평균:%.2f\n",(double)sum/score.length);
	}
}
