package com.zsgs.schoolmaster.loginsetup;

import java.util.Scanner;

public class Loginview {
	private Loginmodel loginmodel;
	public Loginview()
	{
		loginmodel=new Loginmodel(this);
	}
	
	public void getuserinfo()
	{
		System.out.println("welcome to Schoolmaster..");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username:");
		String name=sc.nextLine();
		System.out.println("enetr the password:");
		String password=sc.nextLine();
		System.out.println("loading...");
		loginmodel.authendication(name,password);
	}

	public void onfailed(String string) {
		System.out.println(string);
		getuserinfo();
		
	}

	public void onsuccess() {
		System.out.println("Successful login...");
		
	}
}

