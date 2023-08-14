package org.tnsif.customexception;
//program to demonstrate the custom exception
/*to use custom exception extends an Exception class(parent)*/
 @SuppressWarnings("serial")
public class LoginCredentials extends Exception{

	private String str;
	//getters and setters

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	//parameterizes constructor

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
}
