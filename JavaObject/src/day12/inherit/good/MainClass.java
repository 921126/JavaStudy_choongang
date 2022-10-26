package day12.inherit.good;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person(); //부모
		p.age = 10;
		p.name = "부모님";
		System.out.println(p.info());
		
		//자식 클래스
		Student s = new Student();
		s.age = 20;
		s.name = "홍길자";
		s.studentId = "123123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "역사";
		System.out.println(t.info());
		
		Employee e = new Employee(); //자식
		e.age = 18;
		e.name = "으악";
		e.department = "개발";
		System.out.println(e.info());
	}
}
