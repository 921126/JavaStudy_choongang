package day14.super_;

public class Teacher extends Person {
	
	String subject; //과목
	
	Teacher(String name, int age, String subject){
		super(name);
//		this.name = name;
//		this.age = age;
		this.subject = subject;
	}
	
	//오버라이딩
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}

}
