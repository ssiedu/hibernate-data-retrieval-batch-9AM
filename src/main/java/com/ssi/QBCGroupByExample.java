package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCGroupByExample {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Criteria cr=session.createCriteria(Account.class);

		Projection proj1=Projections.groupProperty("type");
		Projection proj2=Projections.sum("balance");
		Projection proj3=Projections.avg("balance");
		Projection proj4=Projections.max("balance");
		Projection proj5=Projections.min("balance");
		ProjectionList pL=Projections.projectionList();
		pL.add(proj1); pL.add(proj2); pL.add(proj3);
		pL.add(proj4); pL.add(proj5);
		cr.setProjection(pL);
		List<Object[]> values=cr.list();
		
		for(Object[] value:values) {
			for(Object data:value) {
				System.out.println(data);
			}
			System.out.println("###################");
		}
		
		session.close();
	}

}
