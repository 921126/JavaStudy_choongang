package day27.thread.class_;

//Thread클래스로부터 상속받는 클래스 생성
class ThreadEX extends Thread{
	//public void run 이라는 오버라이딩

	@Override
	//위의 어노테이션은 상위 클래스나 인터페이스에서 제공하는 메서드가 아닌 경우 에러를 발생시켜주는 어노테이션이다.
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread클래스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}

//Runnable 인터페이스를 구현한 클래스를 생성
class RunnableImpl implements Runnable{

	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Runnaable 인터페이스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}

}

public class ThreadCreate {

	public static void main(String[] args) {
		//thread 클래스로부터 상속받은 클래스를 이용해서 스레드를 생성하고 실행
		Thread th1 = new ThreadEX();
		//start를 호출하면 run메서드의 내용을 수행
		th1.start();

		//Runnable 인터페이스를 implements 클래스를 이용해서 스레드를 생성하고 실행
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();

		//Runnable 인터페이스를 Anonymous class를 이용 
		Thread th3 = new Thread(new Runnable() {
			public void run() {
				for(int i =0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous 활용");
					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
			}
		});
		th3.start();

		//Runnable 인터페이스는 public void run 메서드 1개만 소유 
		Thread th4 = new Thread(()->{
			for(int i = 0; i< 10; i++){
				try {
					Thread.sleep(1000);
					System.out.println("람다의 활용");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}});
		th4.start();
	}
}
