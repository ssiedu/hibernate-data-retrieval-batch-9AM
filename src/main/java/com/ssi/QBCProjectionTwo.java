package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionTwo {

	public static void main(String[] args) {
		//here we will fetch more than one column
		
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Account.class);
		
		Projection proj1=Projections.property("ano");
		Projection proj2=Projections.property("name");
		ProjectionList pL=Projections.projectionList();
		pL.add(proj1); pL.add(proj2);
		
		cr.setProjection(pL);
		
		List<Object[]> values=cr.list();
		
		for(Object val[]:values) {
			for(Object item:val) {
				System.out.println(item);
			}
			System.out.println("_____________________________");
		}
		
		
		session.close();

	}

}
