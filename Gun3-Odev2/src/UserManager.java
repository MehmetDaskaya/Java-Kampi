
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "  Derse eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "  kullan�c�s� dersten silindi.");
	}
	
	public void logIn(User user) {
		System.out.println("Tebrikler! " + user.getFirstName() + " " + user.getLastName() + " kayd�n�z yap�ld�. Kullan�c� numaran�z: " + user.id );
	}
}
