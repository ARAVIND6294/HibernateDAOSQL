package com.abc;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDAOImpl implements EmpDAO 
{

	public boolean register(int no, String fname, String lname, String mail) {
		
		Session ses=Hibernateutil.getSession();
		Transaction tx=null;
		try
		{
			tx=ses.beginTransaction();
			Empdetails details=new Empdetails(no,fname,lname,mail);
			ses.save(details);
			tx.commit();
			return true;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean modifyEmail(int no, String newmailid) {
		
	  Session ses=Hibernateutil.getSession();
	  Empdetails details=(Empdetails) ses.get(Empdetails.class, no);
	  if(details!=null)
	  {
		 details.setmail(newmailid);
	  }
	  else
	  {
		  return false;
	  }
	  Transaction tx=null;
	  try
	  {
		  tx=ses.beginTransaction();
		  ses.update(details);
		  tx.commit();
		  return true;
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
		return false;
	}

	public boolean removeEmp(int no) {
		
		Session ses=Hibernateutil.getSession();
		Empdetails details=(Empdetails) ses.get(Empdetails.class, no);
		Transaction tx=null;
		if(details!=null)
		{
			try
			{
				tx=ses.beginTransaction();
				ses.delete(details);
				tx.commit();
				return true;
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				tx.rollback();
				return false;
			}
		}
		else
		{
			return false;
		}
		
	}

	
}
