package dbadapter;

public class User {
	private String name;
	private int age;
	private String emial;
	public User(String name, int age, String emial) {
		super();
		this.name = name;
		this.age = age;
		this.emial = emial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	
	
	

}
