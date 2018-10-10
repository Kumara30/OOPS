package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linkedhashmap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> emp = new LinkedHashMap<>();
		
		emp.put(10, "Arun");
		emp.put(20, "Vel");
		emp.put(30, "King");
		
		
		System.out.println(emp);
		
		System.out.println(emp.keySet());
		System.out.println(emp.values());
		
		Set<Entry<Integer, String>> emp1 = emp.entrySet();
		
		for (Entry<Integer, String> x : emp1) 
		{
		System.out.println(x.getValue());
		System.out.println(x.getKey());
		System.out.println(x.getClass());
		System.out.println(x.toString());
		System.out.println(x.setValue("Kumar"));
		System.out.println("\n");
		}
	
		for(Map.Entry<Integer,String> m:emp.entrySet())
		{
			System.out.println(m.getValue());
			System.out.println(m.getKey());
		}
	}

}
