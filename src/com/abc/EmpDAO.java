package com.abc;

public interface EmpDAO 
{

	public boolean register(int no,String fname,String lname,String mail);
	public boolean modifyEmail(int no,String newmailid);
	public boolean removeEmp(int no);
	
}
