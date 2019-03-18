
public class AgeInvalid extends Exception {
	
	String msg;
	AgeInvalid(String msg){
		super();
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	
}

