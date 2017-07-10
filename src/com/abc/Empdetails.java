package com.abc;

public class Empdetails 
{
	private int no;
	public Empdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String fname,lname,mail;
	public Empdetails(int no, String fname, String lname, String mail) {
		super();
		this.no = no;
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getmail() {
		return mail;
	}
	public void setmail(String mail) {
		this.mail = mail;
	}
	

}
