package day24.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {
	
	public static void main(String[] args) {
	
		//현재 시간을 갖는 Date 인스턴스 생성
		Date currentTime = new Date();
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 : 1992년 11월 26일 13:00:00 로설정
		Date myBrithdayTime = new Date(92,10,26,13,0,0);
		//출력 - 년원일 시분초 출력
		System.out.println(myBrithdayTime);
	
		//년도만 추출해서 출력
		System.out.println(myBrithdayTime.getYear()+1900 + "년도");
		
		//원하는 포맷으로 출력
		//1992년 11월 26일 ?요일 이라고 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(sdf.format(myBrithdayTime));

		//연습과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력하기.
		Date sisBrithdayTime = new Date(92,10,26,13,0,15);
		
		if(myBrithdayTime.getYear() == sisBrithdayTime.getYear() &&
				myBrithdayTime.getMonth()  == sisBrithdayTime.getMonth() &&
				myBrithdayTime.getDay() == sisBrithdayTime.getDay()) {
			System.out.println(myBrithdayTime.getHours() + "시 " + myBrithdayTime.getMinutes() + "분");
		}else {
			System.out.println("연도가 틀려요 ㅎ");
		}
		
	}

}
