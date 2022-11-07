package day28.thread.class2_;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
	
	public static void main(String[] args) {
		
		//세마포어를 이용하지 않고 thread 사용
//		Thread th1 = new Thread(new SemaphoreThread("도도"));
//		Thread th2 = new Thread(new SemaphoreThread("하준"));
//		Thread th3 = new Thread(new SemaphoreThread("두준"));
//		
//		th1.start();
//		th2.start();
//		th3.start();
		
		//세마포어를 이용하여 thread 사용
	
		//2개씩 실행할 수 있는 세마포어
		Semaphore sema = new Semaphore(2);
	
		Thread th1 = new Thread(new SemaphoreThread("도도",sema));
		Thread th2 = new Thread(new SemaphoreThread("하준",sema));
		Thread th3 = new Thread(new SemaphoreThread("두준",sema));
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}
}
