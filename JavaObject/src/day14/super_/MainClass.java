package day14.super_;

public class MainClass {
	
	public static void main(String[] args) {
		
		Mother m = new Mother();
		System.out.println(m.info());
		
		
		Employee e = new Employee("이순신", 20 , "역사");
		System.out.println(e.info());
		
		Teacher t = new Teacher("테스트얌",18,"뀨우");
		System.out.println(t.info());
		

	}
	

}
