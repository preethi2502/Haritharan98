package com.coll.in;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		Map<Object, Object> m = new LinkedHashMap<Object, Object>();
		m.put("A", 10);
		m.put(456, 1.20f);
		m.put('a', 100);
		m.put(800, "west");
		System.out.println(m);
		
		
		Object object = m.get(456);
		
		System.out.println(object);
		
		
		
		
	}

}
