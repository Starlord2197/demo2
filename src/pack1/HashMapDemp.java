package pack1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemp {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,  "hello");
		map.put(10,  "hai");
		map.put(20, "alpha");
		map.put(30,  "beta");
		
//		for(int i=0;i<=map.size();i++)
//			System.out.println(map.get(i));
		
//		Set<Integer> set =map.keySet();
//		for(Integer integer: set) {
//			System.out.println(integer);
//			System.out.println(map.get(integer));
//		}
//		Collection c=map.values();
//		for(Object object:c) {
//			System.out.println(object);
//		}
		
		Set<Entry<Integer,String>> eset=map.entrySet();
		for(Entry<Integer,String> entry:eset) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(map.remove(10));
		System.out.println(map.size());
		System.out.println(map.containsKey(30));
		
		// TODO Auto-generated method stub

	}

}
