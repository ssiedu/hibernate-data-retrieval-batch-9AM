package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QBCExampleOne {

	public static void main(String[] args) {

		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Account.class);
		
		//Criterion crt=Restrictions.gt("balance", 70000);		
		//Criterion crt=Restrictions.lt("balance", 70000);
		//Criterion crt=Restrictions.like("name", "a%");
		//Criterion crt1=Restrictions.between("balance", 55000, 75000);
		//Criterion crt2=Restrictions.eq("type", "saving");
		//Criterion crt3=Restrictions.or(crt1,crt2);
		//Criterion crt3=Restrictions.and(crt1,crt2);
		//cr.add(crt1);
		//cr.add(crt2);
		//cr.add(crt3);
		/*
		Criterion crt4=Restrictions.in("name", "abcd", "pqrs");
		*/
		/*
		List<String> values=new ArrayList<String>();
		values.add("abcd"); values.add("mnop");
		Criterion crt4=Restrictions.in("name", values);
		cr.add(crt4);
		*/
		
		//Order ord1=Order.asc("type");
		
		Order ord1=Order.desc("balance");
		Order ord2=Order.desc("ano");
		cr.addOrder(ord1);
		cr.addOrder(ord2);
		
		List<Account> accounts=cr.list();	
		
		for(Account account:accounts) {
			//System.out.println(account.getAno()+","+account.getName());			
			System.out.println(account);
		}

		session.close();
	}

}
