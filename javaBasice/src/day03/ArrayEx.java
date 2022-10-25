package day03;
import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		//배열은 선언, 생성 초기화 과정을 가진다.
		//1. 배열의 선언
		
		int num; 			//기존 변수 정수의 선언
		
		int[] arr; 			//배열의 선언
		
		//2. 배열의 생성
		arr = new int[5];	//arr 변수에 배열 생성
		
		System.out.println(arr);	//초기화 하지않고 그냥 출력시 주소값(위치)이 출력됨
		
		//3. 배열의 초기화
		//변수의 인덱스 위치에 값을 넣는다. arr[인덱스] = 값
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//arr[5] = 60;		//위치하지 않는 배열에 인덱스 값을 넣을 경우 오류 메세지 출력됨 
		
		//4. 배열의 사용
		
		System.out.println("arr의 첫번째상자:" + arr[0]);	//10
		System.out.println("arr의 세번째상자:" + arr[2]);	//30
		
		//5. 배열의 모습을 문자열로 확인하는 명령문 **외워야 한다.
		System.out.println(Arrays.toString(arr));		//Arrays에 빨간 밑줄이 그어지는 경우 api추가 
		
		//6. 배열의 길이를 확인하는 명령어 **외워야 한다.
		System.out.println("배열의 크기는: " + arr.length); //인덱스 번호와 혼동되면 안된다.
		
		//7. 배열의 선언과 생성을 동시에 하기 **외워야 한다.
		
		byte[] arr2 = new byte[10];
		
		System.out.println(Arrays.toString(arr2));		//배열에 초기값을 지정하지 않은 경우에는 각 타입의 기본값으로 자동 초기화 된다. 0 / 0.0 / null
		
		//8. 배열의 선언 생성 초기화를 동시에 하기 **외워야 한다.
		
		int[] arr3 = {1,2,3,4,5,6,7,8};
		
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("================================================");
		
		//실습
		/*
		 * 1. 스트링 배열을 생성하고 월, 화,수,목 을 저장하라
		 * 2. 크기가 3인 int 배열을 생성하고 1~10중 랜덤값을 저장하라.
		 */
		
		//1번 문제
		
		String[] week = {"월", "화", "수", "목"};
		System.out.println("week배열의 길이는:" + week.length);
		System.out.println(Arrays.toString(week));

		System.out.println("================================================");

		//2번 문제
		int[] disk = new int[3];
		int randNum1 = (int)(Math.random()*10)+1;
		int randNum2 = (int)(Math.random()*10)+1;
		int randNum3 = (int)(Math.random()*10)+1;
		
		disk[0] = randNum1;	//disk[0] = (int)(Math.random()*10)+1; 형식으로도 가능하다.
		disk[1] = randNum2;
		disk[2] = randNum3;
		
		System.out.println("disk배열의 길이는: " + disk.length);
		System.out.println(Arrays.toString(disk));
		
		
	}

}
