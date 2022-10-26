package day13.overload;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(10);
		b.input("a");
		b.input(20, "ab");
		b.input("cd", 30);
		b.input(14, 13, 40);//자동형변환 int > double
	}
}
