package day19.api.lang.sb;

public class StrBufferEx {
	
	public static void main(String[] args) {
		
		
		
		long start = System.currentTimeMillis();
		
//		String str ="";
//		for(int i =0; i < 300000; i++) {
//			str += "A";
//		}
		
		StringBuffer sb2 = new StringBuffer("");
		for(int i =1; i < 300000; i++) {
			sb2.append("A");
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) * 0.001);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String의 기본 생성
		//String str = new String("Java");
		
		//StringBuffer의 기본 생성
		StringBuffer sb = new StringBuffer("Java");

//		System.out.println(str);
//		System.out.println(sb);
	
		//글자 추가하기
//		str = str + "Program"; 	//문자열
//		sb.append("Program");	//버퍼클래스
		
//		System.out.println(str);
//		System.out.println(sb);
	
		//(변수명).append(추가할 내용);
		sb.append("기존 문자열 마지막에 추가");
		
		//(변수명).insert(인덱스,추가할 내용);
		sb.insert(11,"-");
		
		
		//(변수명).replace(인덱스,인덱스,변경할 내용)
		sb.replace(0, 4, "자바");
		
		//(변수명).delete(인덱스,인덱스)
		sb.delete(0, 2);
		
		
		//(변수명).toString()
		String result = sb.toString();
		
		//(변수명).reverse();
		sb.reverse();
		
		System.out.println(result);
		
	}

}
