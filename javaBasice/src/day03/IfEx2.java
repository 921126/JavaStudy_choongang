package day03;
import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {

		//입력받은 점수에 따라서 A, B, C , D , F로 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int point = sc.nextInt();

		String grade = null;	//없는 값

		if(point >= 90 ) {
			//조건검사 중첩
			if(point >= 95) {
				grade = "A+";			
			}else {
				grade = "A0";
			}

		} else if(point >= 80){
			grade = "B";
		} else if(point >= 70) {
			grade = "C";
		} else if(point >= 60) {
			grade = "D";
		}else {
			grade = "E";
		}

		System.out.println(grade + "등급입니다.");
		sc.close();
	}

}
