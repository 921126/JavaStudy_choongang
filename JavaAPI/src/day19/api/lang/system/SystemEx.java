package day19.api.lang.system;

public class SystemEx {
	
	public static void main(String[] args) {
		
		System.out.println("출력");
		
		//시스템 종료
//		System.exit(0);
		
		//가비지컬렉터 실행
//		System.gc();
		
		//시간(UTC)을 밀리초 단위로 리턴함
		long start = System.currentTimeMillis();
		System.out.println(start); //1970/1/1 이후~ 현재까지의 시간
		
		long sum = 0;
		for(long i = 1; i <= 10000000000L; i++) {
			sum+= i;
		}
		
		long end = System.currentTimeMillis();
		//System.out.println(end);
		System.out.println((end-start)*0.001 + "초 소요됨");
	}

}
