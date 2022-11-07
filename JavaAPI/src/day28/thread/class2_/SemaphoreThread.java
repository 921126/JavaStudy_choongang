package day28.thread.class2_;

import java.util.concurrent.Semaphore;

public class SemaphoreThread implements Runnable{

	String message;
	Semaphore sema;
	
	//생성자
	public SemaphoreThread(String message) {
		this.message = message;
	}

	public SemaphoreThread(String message, Semaphore sema) {
		this.message = message;
		this.sema = sema;
	}
	
	@Override
	public void run() {

		try {
			//리소스 확보
			sema.acquire();
			
			Thread.sleep(10000);
			System.out.println(message);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		//리소스 해제
		sema.release();
	}
	
	
	

}
