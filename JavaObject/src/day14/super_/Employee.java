package day14.super_;

public class Employee extends Person{
	
	String department;
	
	Employee(String name, int age, String department){
		super(name,age);
//		super();			주석처리 된 내용은 위 구문과 동일한 뜻
//		this.name = name;
//		this.age = age;
		this.department = department;
		
	}
	
	
	//오버라이딩
	String info() {
		return super.info() + ", 부서:" + department;
	}

}
