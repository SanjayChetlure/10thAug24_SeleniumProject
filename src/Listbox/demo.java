package Listbox;

import java.util.ArrayList;
import java.util.List;

public class demo 
{
	public static void main(String[] args) {
		
		String name="abcd";
		
		
		
//		ArrayList<String> al=new ArrayList<String>();
		List<String> al=new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
				
		for(String s1:al)
		{
			System.out.println(s1.toUpperCase());
		}
		
		System.out.println(al.size());
		
		
		int size = al.size();
		System.out.println(size);
	}

}
