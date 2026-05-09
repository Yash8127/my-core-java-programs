package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

	public static void main(String[] args) {
		System.out.println("main methos started");
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("c", 3);
		map1.put("D", 4);
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 1);
		map2.put("B", 2);
		map2.put("C", 3);
		map2.put("D", 4);
		for (String key : map2.keySet()) {
			if (map1.containsKey(key)) {
				int sum = map1.get(key) + map2.get(key);
				map1.put(key, sum);
			} else {
				map1.put(key, map2.get(key));
			}
		}

		System.out.println(map1);
	}

}
