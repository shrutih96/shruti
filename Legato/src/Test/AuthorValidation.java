package Test;

public class AuthorValidation extends Exception{
	String msg;
	
	 String error(String m) {
		this.msg=m;
		return msg;
	}
}
