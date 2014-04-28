package generic;

import java.util.*;


public class PrintContainers {
	static Collection fill(Collection<String> collection){
		collection.add("dog");
		collection.add("cat");
		collection.add("pig");
		collection.add("horse");
		return collection;
	} 
	static Map fill(Map<String,String> map){
		map.put("Mupei", "dog");
		map.put("pig", "wushan");
		map.put("cat", "tanxuan");
		map.put("horse", "tan");
		
		return map;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fill(new Vector<String>()));
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		/*System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));
		System.out.println(fill(new LinkedHashMap<String,String>()));*/
	}

}

