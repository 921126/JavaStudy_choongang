package day19.api.lang.object;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		
		//오브젝트가 같은지 비교
		boolean bl = p.equals(p2);
		System.out.println(bl);
		
		//toString > 객체 주소 불러오는 기능 하지만 오버라이딩해서 더 많이씀
//		String result = p.toString();
//		System.out.println(result);
		System.out.println(p.toString()); //오버라이딩한 것
		
		//clone() - 객체복사
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			System.out.println(p3 == p);
			System.out.println("복사된 객체의 name" + p3.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		

		
	}
}
