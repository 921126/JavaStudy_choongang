package pec.def;

import java.util.Scanner;

//import pec.abc.Apple; 	//패키지명을 포함한 클래스명
//import pec.abc.Banana;
import pec.abc.*;			//한번에 다쓰기

public class MainClass {
	
	public static void main(String[] args) {
	
		//같은 폴더에 위치한 class 사용
		Melon m = new Melon();	//자동사용 가능
		
		//다른 폴더에 위치한 class 사용
		Apple a = new Apple(); //최상단 import 추가
		Banana b = new Banana();
		
		Scanner sc = new Scanner(System.in);  
		
	}
}

