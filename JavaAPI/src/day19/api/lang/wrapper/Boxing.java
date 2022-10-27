package day19.api.lang.wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		long c = 200L;
		
		//기본형 타입을 객체형으로 포장하는 작업을 boxing이라 한다.
		Integer val = new Integer(a);
		Double val2 = new Double(b);
		Long val3 = new Long(c);

		Object[] arr = {val, val2, val3}; //객체형 변수를 object 배열에 저장
		
		
		//객체형 -> 기본형으로 변경하는 작업을 unboxing이라 한다.
		int a1 = val.intValue();
		double b1 = val2.doubleValue();
		long c1 = val3.longValue();
		
		
		System.out.println(val);
	}
}
