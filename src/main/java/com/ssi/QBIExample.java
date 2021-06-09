package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) {
			//here we will fetch the data using Query By Id
		
			Session session=Utility.getSF().openSession();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Account Number : ");
			int ano=sc.nextInt();
			Account account=session.get(Account.class, ano);
			//Account account=session.load(Account.class, ano);
			System.out.println(account);
			/*
			System.out.println(account.getAno());
			System.out.println(account.getName());
			System.out.println(account.getType());
			System.out.println(account.getBalance());
			*/
			session.close();
			
	}

}
