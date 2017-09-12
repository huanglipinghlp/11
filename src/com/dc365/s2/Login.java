package com.dc365.s2;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport
{
	// 变量 *********************************************************************
	private String username = "";
	private String password = "";
	
	// 函数 *********************************************************************
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception
	{
		String u,p;
		u = getUsername();
		p = getPassword();
		
		if(u.equals("1") && p.equals("1"))
		{
			return "Success";
		}
		else
		{
			return "Error";
		}
		
	}
	
	
	
	

}
