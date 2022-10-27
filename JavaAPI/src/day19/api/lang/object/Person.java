package day19.api.lang.object;

public class Person implements Cloneable {
	
	private String name;
	
	//생성자
	public Person(String name) {
		this.name = name;
	}

	//getter.setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//오버라이딩 - toString
	//generate toString
	public String toString() {
		return "Person [name=" + name + "]";
	}

	//오버라이딩 epuals
	//멤버변수명이 같으면 true 반환
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			String n = p.getName();
			
			if(n.equals(this.name)) {
				System.out.println("이름이 같음");
				return true;
			}
		}
		
		return false;
	}

	//clone 메서드를 사용하고싶다면 override
	//그냥 해당 내용을 오버라이드했을 때 오류가 발생한다.
	//그럴때는 인터페이스를 상속받아야한다. cloneable 을 상속받으면 가능해짐.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
