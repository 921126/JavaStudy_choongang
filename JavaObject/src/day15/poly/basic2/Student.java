package day15.poly.basic2;

public class Student extends Person {

	String studentId;
	//this 키워드를 이용해서 3개짜리
	
	//생성자
//	Student(){
//		this("정보없음",18,"정보없음");
//	}
	
	Student(String name, int age, String studentId){
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.studentId = studentId;
	}
	
	//오버라이딩
	String info() {
		return  "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
}
