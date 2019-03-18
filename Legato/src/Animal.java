
public class Animal {
	private String name,breed;
	private int noOfEyes,age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Animal(){
		
	}
	Animal(String name,String breed,int age){
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	void getAnimalLifestyle() {
		System.out.println("Animal name:"+name+" Breed:"+breed+" Age:"+age);
	}
}

	
