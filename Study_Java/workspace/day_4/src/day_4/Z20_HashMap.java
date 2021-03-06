package day_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.text.html.parser.Entity;

/**
 * 
 * List : 순서가 있다. 중복허용
 * Set : 순서가 없다, 중복허용 없음, 중복된 데이터는 저장하지 않는데 
 * Map : 하나의 원소가 키:값 쌍으로 구성된 자료의 묶음
 * 		키는 원소를 구분하는 기준(중복허용 않함)
 * 		값은 중복이 허용된다.(덮어쓰기 됨)
 * 		키의 중복을 체크하는 방법은 
 * 			Hash기법 -> HashMap
 * 			Binary Search Tree -> TreeMap
 * @author Ryush
 *
 */
public class Z20_HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("사과", 1000);
		hm.put("배", 2000);
		hm.put("사과", 3000); //키가 중복되면 값이 업데이트 된다
		hm.put("수박", 9999);
		
		System.out.println(hm);
		System.out.println(hm.get("사과"));
		System.out.println(hm.get(1)); //null
		
		//순회
		Set<String> ks = hm.keySet(); // 키들의 묶음
		for (String key : ks) {
			System.out.println(key + " : " + hm.get(key) + " 원");
		}
		//keySet 구조에서 iterator, listIterator 객체를 얻어서 순회할 수 있다.
		
		Set<Entry<String, Integer>> entrySet =  hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + " 원");
		}
		
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
	}
}
