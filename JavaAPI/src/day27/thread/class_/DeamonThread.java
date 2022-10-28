package day27.thread.class_;

public class DeamonThread {
	public static void main(String[] args) {

		//1~10까지 1초씩 딜레이하면서 출력하는 스레드
		Thread th = new Thread(() -> {
			for(int i = 0; i <10; i++) {
				try {
					Thread.sleep(1000);
					System.out.print((i+1) + " ");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		//th.start();
		
		//데몬 스레드로 설정 - 다른 작업이 없으면 자동 종료
		th.setDaemon(true);
		th.start();
		try {
			Thread.sleep(3000);
			System.out.println("메인종료");
		} catch (Exception e) {};
		
	}
}
