package day08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		/*
		//배열에서 삭제 개념은 없다.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//배열의 데이터를 앞으로 당겨와서 삭제한것처럼 보이기
		for(int i = 4; i < arr.length-1; i++) {
			arr[i] = arr[i+1];	//현재 위치에 다음 데이터를 넣는다.
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};

		System.out.print("삭제할 이름>");
		String name = sc.next();
		
		int count = arr.length;	//삭제가 일어났을 때 하나씩 감소
		
		for(int i =0; i < count; i++) {
			
			if(name.equals(arr[i])) {		//같은 데이터 찾기
				
				for(int j =i; j < count -1; j++) {	//데이터 삭제한것처럼 당겨오기
					arr[j] = arr[j+1];
				}
				count--;			//개수 감소
			}
		}
		
		//출력
		String str = "[";
		for(int i = 0; i < count; i++) {
			str += arr[i];
			if( i == count -1) {
				str += "]";
				break;
			}
			str +=", ";
		}
		System.out.println(str);
	}
}
