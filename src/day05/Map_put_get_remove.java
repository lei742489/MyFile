package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map��Ϊ���ұ���key-value�Ե���ʽ��ŷ�Ԫ��
 * ��Map����һ��Ҫ�󣬼���key�������ظ�(equals�ж�)
 * 
 * ����ʵ����:java.util.HashMap(ɢ�б�);
 * 			TreeMap ������ʵ��
 * @author tarena
 *
 */
public class Map_put_get_remove {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<String, Integer>();	
		
		map.put("����", 85);
		map.put("��ѧ", 95);
		map.put("Ӣ��", 82);
		map.put("����", 89);
		map.put("��ѧ", 90);
		System.out.println(map);
		
		
		//���ظ���key��ԭkey�ᱻ�滻,�����ر��滻��ֵ����������key�����ڣ��򷵻�null;
		map.put("��ѧ", 100);
		System.out.println(map);
		
		Integer i = map.put("Ӣ��", 96);
		System.out.println(i);
		System.out.println(map);
		
		Integer j = map.put("����", 56);
		System.out.println(j);
		System.out.println(map);
		
		
		/*
		 * V remove(K k)
		 * ���ݸ�����key����Ӧ�������ֵ��ɾ��
		 * ����ֵΪ��Ӧ��value
		 * �ϸ�����key�������򷵻�null
		 */
		
		map.remove("����");
		
		System.out.println(map);
		
		
		/*
		 * V get(K k)
		 * ��ȡ������key����Ӧ��value
		 * ��������key�����ڣ��򷵻�null
		 */
		
		Integer d = map.get("����");
		System.out.println("���ģ�"+d);
		
	}

}
