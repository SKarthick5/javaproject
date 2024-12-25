package com.zsgs.ticketpro.ui.loginsetup;

import java.util.Scanner;

import com.zsgs.ticketpro.Ticketpro;


public class Loginview {
	private Loginmodel loginmodel;
	public Loginview()
	{
		loginmodel=new Loginmodel(this);
	}
	
	public void init()
	{
		System.out.println("welcome to"+Ticketpro.getInstance().getAppName());
		System.out.println("App version"+Ticketpro.getInstance().getAppVersion());
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
		init();
		
	}

	public void onsuccess() {
		System.out.println("Successful login...");
		
	}
	
public void getForgetPasswordInfo() {
		
	}
	

	public void onForgotEamilSent() {
		
	}
	
	
	public void onForgortEmailSentFailed() {
		
	}
}
