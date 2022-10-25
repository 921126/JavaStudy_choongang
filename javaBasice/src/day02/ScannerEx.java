package day02;
import java.util.Scanner; //자바안의 기능

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//1. Scanner 생성한다.
		Scanner scan = new Scanner(System.in);
	 
		System.out.println("이름 > 입력해주세요.");
		//2 문자열을 입력받고 name 변수에 저장
		String name = scan.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.println("나이 > 입력해주세요.");
		//3. 정수형 값 입력받기
		int age = scan.nextInt();
		System.out.println(name + " 당신의 나이는 " + age + "살 입니다.");
		
		//4. 더이상 입력을 받지 않을 때 닫아주기.
		scan.close();
	}

}
