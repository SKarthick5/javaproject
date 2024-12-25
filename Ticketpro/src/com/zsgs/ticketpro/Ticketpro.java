package com.zsgs.ticketpro;

import com.zsgs.ticketpro.ui.loginsetup.Loginview;

public class Ticketpro {
	
	private static Ticketpro ticketpro;
	public static Ticketpro getInstance()
	{
		if(ticketpro==null)
		{
			ticketpro=new Ticketpro();
		}
		return ticketpro;
	}
	
	public String getAppName() {
		return Ticketpro.class.getSimpleName();
	}

	public String getAppVersion() {
		return ".02";
	}
	
	private void init() {
		new Loginview().init();
	}
	public static void main(String[] args) {
		Ticketpro.getInstance().init();

	}

}
