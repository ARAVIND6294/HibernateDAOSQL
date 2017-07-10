package com.abc;

public class EmpDAOFactory 
{
	public static EmpDAO getDAOInstance()
	{
		return new EmpDAOImpl();
	}

}
