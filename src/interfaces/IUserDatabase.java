package interfaces;

public interface IUserDatabase {
	public boolean addUser(String name, int age, String email);
	public boolean check_registration(int age);

}
