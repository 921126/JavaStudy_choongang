package day15.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		//호텔클래스 사용
		Hotel h = new Hotel();
		
		
		//setter의 사용
//		h.sefChef(new Chef()); 	  1. 사용방법
		
		Chef chef = new Chef(); 
		h.sefChef(chef);		//2. 사용방법(1번과 2번은 동일함)
		
		//getter의 사용
		Chef c = h.getChef();
		c.cooking();
		
		System.out.println( chef == c);
	}
}
