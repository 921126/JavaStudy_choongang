package day25.api.util.map;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
		
		//HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//Map에 데이터 저장 - put
		map.put("num", 1);
		map.put("ani", "강아지");
		map.put("name", "도도");
		
		//Map 데이터 추출 - get
		System.out.println(map.get("name"));
		
		//Map 데이터 삭제 - remove
		map.remove("num");
		
		//전체 데이터 확인
		System.out.println(map);
		
		//존재하지 않는 key를 사용하면 자바는 null을 리턴
		System.out.println(map.get("age"));
		
		//Map을 이용하면 Key의 이름을 몰라도 모든 데이터를 접근하는 것이 가능
		//1. 모든 key에 접근할 수 있는 Set을 가져오기
		Set<String> keys = map.keySet();
		
		//2. Set 순회
		for(String key : keys) {
			//key를 순회하면서 key에 저장된 value를 확인
			System.out.println(key + ": " + map.get(key));
		}
		
	}

}
