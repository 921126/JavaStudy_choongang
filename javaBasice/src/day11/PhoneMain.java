package day11;

public class PhoneMain {

	public static void main(String[] args) {
		
		//객체1
		Phone red = new Phone();
		red.info();
		
		//객체2
		Phone blue = new Phone("가로본능");
		blue.info();
		
		//객체3
		Phone black = new Phone("세로본능", 3000);
		black.info();
		
		//객체4
		Phone wh = new Phone(4000, "큐리텔");
		wh.info();
		
		//객체5
		Phone gr = new Phone("아이폰",10000,"초록");
		gr.info();
		
	}
}
