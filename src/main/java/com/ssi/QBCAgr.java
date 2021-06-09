package com.ssi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class QBCAgr {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Account.class);
		//finding sum of balances of all accounts
		
		Projection proj=Projections.avg("balance");
		cr.setProjection(proj);
		double result=(Double)cr.uniqueResult();
		System.out.println("Avg Balance : "+result);
		
		/*
		Projection proj=Projections.sum("balance");
		cr.setProjection(proj);
		long result=(Long)cr.uniqueResult();
		System.out.println("Total of Balance : "+result);
		*/
		session.close();
		
		
	}

}
