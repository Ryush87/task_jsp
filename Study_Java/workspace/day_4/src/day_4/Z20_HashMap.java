package day_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.text.html.parser.Entity;

/**
 * 
 * List : ������ �ִ�. �ߺ����
 * Set : ������ ����, �ߺ���� ����, �ߺ��� �����ʹ� �������� �ʴµ� 
 * Map : �ϳ��� ���Ұ� Ű:�� ������ ������ �ڷ��� ����
 * 		Ű�� ���Ҹ� �����ϴ� ����(�ߺ���� ����)
 * 		���� �ߺ��� ���ȴ�.(����� ��)
 * 		Ű�� �ߺ��� üũ�ϴ� ����� 
 * 			Hash��� -> HashMap
 * 			Binary Search Tree -> TreeMap
 * @author Ryush
 *
 */
public class Z20_HashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("���", 1000);
		hm.put("��", 2000);
		hm.put("���", 3000); //Ű�� �ߺ��Ǹ� ���� ������Ʈ �ȴ�
		hm.put("����", 9999);
		
		System.out.println(hm);
		System.out.println(hm.get("���"));
		System.out.println(hm.get(1)); //null
		
		//��ȸ
		Set<String> ks = hm.keySet(); // Ű���� ����
		for (String key : ks) {
			System.out.println(key + " : " + hm.get(key) + " ��");
		}
		//keySet �������� iterator, listIterator ��ü�� �� ��ȸ�� �� �ִ�.
		
		Set<Entry<String, Integer>> entrySet =  hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue() + " ��");
		}
		
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
	}
}