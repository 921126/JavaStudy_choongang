package day23.api.lang.arrays;

//(VO가 붙으면 데이터관련 클래스)
public class PersonVO implements Comparable<PersonVO>{

	private int num;
	private String name;
	private int age;

	//매개 변수가 없는 생성자 - Default Constructor
	public PersonVO() {
		super();
	}


	//속성을 전부 배개변수로 받는 생성자 - 인스턴스 생성 후 빠르게 대입하기 위해서 생성
	public PersonVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}



	//getter& setter : 속성값에 접근하고 변경하기 위한 메서드
	//일반적으로 VO클래스의 경우는 setter를 만들지 않음.
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	//데이터 출력을 편리하게 하기 위한 메서드
	//출력하는 메서드에 인스턴스 이름을 대입하면 이 메서드가 호출되어 출력된다.
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

//	//크기비교 메서드 (작 > 큰)
//	public int compareTo(PersonVO o) {
//		//크기 비교 방법 설정
//		return this.age - o.age;
//	}
//
//	//크기비교 메서 (큰 >작)
//	public int compareTo2(PersonVO o) {
//		//크기 비교 방법 설정
//		return o.age - this.age;
//	}
//
//	//크기비교 메서 (오름차순)
//	public int compareTo3(PersonVO o) {
//		//크기 비교 방법 설정
//		return this.name.compareTo(o.name);
//	}

	//크기비교 메서 (내림차순)
	public int compareTo(PersonVO o) {
		//크기 비교 방법 설정
		return o.name.compareTo(this.name);
	}
}
