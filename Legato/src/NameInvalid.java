
public class NameInvalid extends Exception {
	
	String msg;
	NameInvalid(String msg){
		super();
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	
}
