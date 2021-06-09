package com.ssi;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class SQLExample {
	public static void main(String[] args) {

		Session session = Utility.getSF().openSession();
		String sql="select * from account";
		SQLQuery query=session.createSQLQuery(sql);
		query.addEntity(Account.class);
		List<Account> accounts=query.list();
		for(Account account:accounts) {
			System.out.println(account);
		}
		session.close();

	}
}
