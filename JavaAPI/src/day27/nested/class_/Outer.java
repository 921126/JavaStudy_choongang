package day27.nested.class_;

public class Outer {//외부 클래스
	
	class Inner{//내포 클래스 - 다른 클래스 안에 만들어진 클래스
		public int num;
	}

	
	static class StaticInner{ //내부 클래스에 static도 가능
		public static int share;
	}
	
	//메서드
	public void method() {
		//local Inner > 메서드 안에서 만들어진 클래스
		//메서드 안에서만 사용이 가능하다.
		class LocalInner{
			public int num;
		}
	}
}
