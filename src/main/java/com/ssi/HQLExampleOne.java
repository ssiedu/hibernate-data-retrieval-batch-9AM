package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLExampleOne {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		
		String hql="from Account order by balance desc";

		Query qr=session.createQuery(hql);
		
		List<Account> accounts=qr.list();
		
		for(Account account:accounts) {
			System.out.println(account);
		}

		session.close();
		
	}

}
