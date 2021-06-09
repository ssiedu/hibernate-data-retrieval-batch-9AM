package com.ssi;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Object info1[]= {111,"AAA"};
		Object info2[]= {112,"BBB"};
		Object info3[]= {113,"CCC"};
		
		List<Object[]> values=new ArrayList<Object[]>();
		values.add(info1); values.add(info2); values.add(info3);
		
		for(Object ar[]:values) {
			for(Object data:ar) {
				System.out.println(data);
			}
			System.out.println("#####################");
		}
		

	}

}
