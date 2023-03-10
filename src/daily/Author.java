package daily;

public class Author {
	private String name;
	private String email;
	private char gender = 'f';

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.getGender() + ")" + " at " + this.getEmail();
	}

}
