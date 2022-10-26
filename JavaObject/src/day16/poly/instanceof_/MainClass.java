package day16.poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		// instanceof - 객체의 모형을 확인
		
		Person s = new Student("홍길동", 10, "1234");
		Person t = new Teacher("이순신", 20, "프로그램"); 
		
//		Student s2 = (Student)s; //기본 캐스팅
//		Teacher t2 = (Teacher)s; //캐스팅을 잘못할 경우 오류 발생
	
		//메서드를 통해 instanceof를 활용한 캐스팅
		casting(s);
		casting(t);
	}

	public static void casting(Person p) {
		
		if(p instanceof Student) { //p가 학생이면 true, 아니면 false
			Student s = (Student)p;
			System.out.println(s.info());
		}else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}
		
	}


}
