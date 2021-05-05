
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "  Derse eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "  kullanýcýsý dersten silindi.");
	}
	
	public void logIn(User user) {
		System.out.println("Tebrikler! " + user.getFirstName() + " " + user.getLastName() + " kaydýnýz yapýldý. Kullanýcý numaranýz: " + user.id );
	}
}
