package day16.poly.instanceof_;

public class Person {
	
	String name;
	int age;
	
	//생성자
//	Person(){
//		this("홍길동",1); //두개짜리 생성자 호출
//	}
	public Person() {
	}
	
	Person(String name){
		this(name,1);	//두개짜리 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name.toUpperCase();
		this.age = age;
	}
	
	//메서드
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
	

}



