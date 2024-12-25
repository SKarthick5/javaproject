package com.zsgs.ticketpro.ui.loginsetup;

public class Loginmodel {
	private Loginview loginview;
	private loginviewinter loginviewinter1;
	
	public Loginmodel(Loginview loginview)
	{
		this.loginview=loginview;
	}
	public void authendication(String name, String password) {
		if(!name.equals("karthicks"))
		{
			loginview.onfailed("invalid name");
		}
		else if(!password.equals("sk@05"))
		{
			loginview.onfailed("invalid password");
		}
		else
		{
			loginview.onsuccess();
		}
		
	}
}
