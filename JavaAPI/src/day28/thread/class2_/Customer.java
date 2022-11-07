package day28.thread.class2_;

public class Customer extends Thread {
	
	public Product myList;
	
	//생성자
	public Customer(Product myList) {
		this.myList = myList;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <26; i++) {
			myList.get();
		}
	}

}
