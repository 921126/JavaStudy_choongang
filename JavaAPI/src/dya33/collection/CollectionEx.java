package dya33.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		list.add(1992);
		list.add(11);
		list.add(26);
		
		System.out.println(list);
		
		Collection<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		list2.addAll(list);
		System.out.println(list2);
	
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "소주");
		map.put(2, "맥주");
		map.put(3, "양주");
		System.out.println(map);
	
		//맵의 반복
		Set<Entry<Integer, String>> ens = map.entrySet();
		//System.out.println(ens);
		
		for(Entry<Integer, String> e: ens) {
			//System.out.println(e);
			System.out.println(e.getValue());
		
		}
	}
}
