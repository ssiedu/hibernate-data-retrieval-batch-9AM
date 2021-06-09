package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class QBCProjection {

	public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Account.class);
		
		Criterion crt=Restrictions.ge("ano", 1003);
		cr.add(crt);
		
		Projection pr=Projections.property("ano");
		cr.setProjection(pr);
		
		List<Integer> numbers=cr.list();
		
		for(Integer number:numbers) {
			System.out.println(number);
		}
		/*
		Projection pr=Projections.property("name");
		cr.setProjection(pr);
		
		List<String> names=cr.list();
		
		for(String name:names) {
			System.out.println(name);
		}
		*/
		
		session.close();
		
		
	}

}
