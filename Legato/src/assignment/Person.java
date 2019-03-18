
package assignment;

public class Person extends Account{
	private String name;
	private String age;
	
	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name:"+name+"Age"+age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
