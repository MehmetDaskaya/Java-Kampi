
public class User {

	int id;
	int Age;
	String firstName;
	String lastName;
	String citizenId;
	
	public User() {
			
		}
		
		public User(String citizenId, String firstName, String lastName) {
		
			this.citizenId = citizenId;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAge() {
			return Age;
		}

		public void setAge(int age) {
			Age = age;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCitizenId() {
			return citizenId;
		}

}
