package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil 
{
	private static SessionFactory factory;
	private static ThreadLocal<Session> t1=new ThreadLocal<Session>();
	
	static
	{
		try
		{
			factory=new Configuration().configure("com/abc/hibernate.cfg.xml").buildSessionFactory();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static Session ses=null;
	public static Session getSession()
	{
		try
		{
			if(t1.get()==null)
			{
				ses=factory.openSession();
				t1.set(ses);
				return ses;
				
			}
			else
			{
				ses=t1.get();
				return ses;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public static void closeconnection()
	{
		try
		{
			ses.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
