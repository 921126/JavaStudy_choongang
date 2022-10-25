package day05;

public class WhileEx06 {
	
	public static void main(String[] args) {
	
		//배열과 반복문의 조합
		//시작은 0 ~ 길이미만
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
		int i = 0;
		int sum = 0; // 누적용 데이터
		
		while( i < arr.length ) {	// 배열의 길이만큼 반복문을 돌리겠다. i <= arr.length -1
			
			// System.out.println(i); > 0 ~ 9까지 출력
			//System.out.println(arr[i]); 	//배열 데이터 출력
		
			sum += arr[i];			//배열안의 데이터 더하기 . 실제 요소값을 더한다.
			
			i++;
		}
		System.out.println("배열요소의 합: " + sum);
	}

}
