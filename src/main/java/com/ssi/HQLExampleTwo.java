package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleTwo {
public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		
		String hql="select ano,name from Account";

		Query qr=session.createQuery(hql);
		
		List<Object[]> values=qr.list();
		
		for(Object[] value:values) {
			for(Object data:value) {
				System.out.println(data);
			}
			System.out.println("__________________________");
		}
		
		
		session.close();
		
	}
}
