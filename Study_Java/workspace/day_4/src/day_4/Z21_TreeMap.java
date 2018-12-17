package day_4;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Z21_TreeMap {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("src/day_4/input_test.txt"); Scanner sc = new Scanner(fis)) {
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			while (sc.hasNext()) { // ���� ��ū�� �ִ��� 
				String word = sc.next(); 
//				System.out.println(word);
				if (hm.containsKey(word)) { // �����ϸ�, �⺻�� + 1�� ������Ʈ
					int num = hm.get(word);
					hm.put(word, num+1);					
				}else {
					hm.put(word, 1);
				}
			}
			System.out.println(hm);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}