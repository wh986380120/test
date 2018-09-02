package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import org.junit.Test;

public class TestDemo1 {
	
	public void  f(String in,ArrayList al){
		if(al.size()==1){
			String temp=in;
			if (!(temp.contains("35")||temp.contains("53")||temp.indexOf("4")==2)) {
				System.out.println(temp);
			}
		}else{
			ArrayList hsc=(ArrayList) al.clone();
			if (in.length()!=0) {
				
				hsc.remove(in.substring(in.length()-1));
			}
			for (Object object : hsc) {
				f(in+object, hsc);
			}
		}
	}
	@Test
	public void testdemo(){
		ArrayList list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		f("", list);
	}
	@Test
	public void test1(){
		String a=new String("hello");
		String b="he"+new String("llo");
		System.err.println(a==b);
	}
}


