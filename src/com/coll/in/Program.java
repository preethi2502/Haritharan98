package com.coll.in;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		String s = "for the people by the people of the people";
		String[] split = s.split(" ");

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		System.out.println(map);

		for (String key : split) {
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}

}
