package 测试;

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
		
		
		
		
		//1.将集合转换成数组
		
		Object[] arr = coll.toArray();		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		System.out.println();
		
		//将集合遍历
		//14.iterator():返回一个Iterator接口实现类的对象,进而实现集合的遍历！
		Iterator iterator = coll.iterator();
		//Iterator iterator = coll.iterator();
		//方式一：不用
		/*System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());*/
		//方式二：不用
//		for(int i = 0;i < coll.size();i++){
//			System.out.println(iterator.next());
//		}
		//方式三：使用
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	
		
		// 2.size():返回集合中元素的个数
		System.out.println("size测元素个数："+coll.size());			
		
		
		
		Collection coll1 = new ArrayList();
		coll1.add(123);
		coll1.add(456);
		
	
		
		//3.retainAll(Collection coll):求当前集合与coll的共有的元素，返回给当前集合
		coll.retainAll(coll1);
		System.out.println(coll);
		
		// 4.containsAll(Collection coll):判断当前集合中是否包含coll中所有的元素
		boolean b = coll.containsAll(coll1);
		System.out.println(b);
		
		//5.addAll(Collection coll):将形参coll中包含的所有元素添加到当前集合中
		//Collection coll2 = Arrays.asList(1, 2, 3);
		coll.addAll(coll1);
		System.out.println(coll+"   "+coll.size());
		
		
	}
	//使用增强for循环实现集合的遍历
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
	
