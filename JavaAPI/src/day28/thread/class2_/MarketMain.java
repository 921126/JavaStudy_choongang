package day28.thread.class2_;

public class MarketMain {
	
	public static void main(String[] args) {
		
		//자원 생성
		Product pd = new Product();
		
		//하나의 자원을 이용해서 2개의 스레드를 생성해서 실행
		new Producer(pd).start();
		new Customer(pd).start();
	}

}
