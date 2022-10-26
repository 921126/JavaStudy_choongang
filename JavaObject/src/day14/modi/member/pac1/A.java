package day14.modi.member.pac1;

public class A {
	
	//멤버변수와 접근제한자
	public int var1;
	int var2;
	private int var3;
	
	
	//메서드와 접근제한자
	public void methode01() {}
	void methode02() {}
	private void methode03() {}
	
	//생성자와 접근제한자
	public A() {
		
		//같은 클래스 내의 접근제한자 변수 사용
		this.var1 = 1;
		this.var2 = 2;
		this.var3 = 3; //프라이빗 가능
		
		//같은 클래스 내의 접근제한자 메서드 사용
		this.methode01();
		this.methode02();
		this.methode03();
	}

}
