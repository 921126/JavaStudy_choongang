package day33.generic;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ABC<String> abc = new ABC<>();
		abc.setAbc("ABC의 타입은 스트링이다.");
		System.out.println(abc.getAbc());
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("소주");
		arr.add("맥주");
		arr.add("위스키");
		
		System.out.println(arr);
	}
}


