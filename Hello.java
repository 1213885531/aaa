package ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;


public class Hello {
	@Test
	public void text1(){
		Collection coll = new ArrayList();
		coll.add("aa");
		coll.add(new Date());
		coll.add(123);
		
		
		
		
		//1.������ת��������
		
		Object[] arr = coll.toArray();		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		System.out.println();
		
		//�����ϱ���
		//14.iterator():����һ��Iterator�ӿ�ʵ����Ķ���,����ʵ�ּ��ϵı�����
		Iterator iterator = coll.iterator();
		//Iterator iterator = coll.iterator();
		//��ʽһ������
		/*System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());*/
		//��ʽ��������
//		for(int i = 0;i < coll.size();i++){
//			System.out.println(iterator.next());
//		}
		//��ʽ����ʹ��
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	
		
		// 2.size():���ؼ�����Ԫ�صĸ���
		System.out.println("size��Ԫ�ظ�����"+coll.size());			
		
		
		
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(456);
		
	
		
		//3.retainAll(Collection coll):��ǰ������coll�Ĺ��е�Ԫ�أ����ظ���ǰ����
		coll.retainAll(coll1);
		System.out.println(coll);
		
		// 4.containsAll(Collection coll):�жϵ�ǰ�������Ƿ����coll�����е�Ԫ��
		boolean b = coll.containsAll(coll1);
		System.out.println(b);
		
		//5.addAll(Collection coll):���β�coll�а���������Ԫ����ӵ���ǰ������
		//Collection coll2 = Arrays.asList(1, 2, 3);
		coll.addAll(coll1);
		System.out.println(coll+"   "+coll.size());
		
		
	}
	//ʹ����ǿforѭ��ʵ�ּ��ϵı���
	@Test
	public void testFor(){
		Collection coll = new ArrayList();
		coll.add(123);
		coll.add(new String("AA"));
		coll.add(new Date());
		coll.add("BB");
		
		for(Object i:coll){
			System.out.println(i);
		}
	}
}
	
