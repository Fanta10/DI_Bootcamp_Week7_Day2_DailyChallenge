package daily;

public class Book extends Author {
	private String title;
	private Author auteur;
	private double price;
	private int qty;

	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Book(String title, Author auteur, double price, int qty) {
		super(auteur.getName(), auteur.getEmail(), auteur.getGender());
		this.title = title;
		this.auteur = auteur;
		this.price = price;
		this.qty = qty;
	}


	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Author getAuteur() {
		return auteur;
	}


	public void setAuteur(Author auteur) {
		this.auteur = auteur;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return super.toString() + " Book [name=" + this.getTitle() + ", price=" + this.getPrice() + ", qty=" + this.getQty() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author auteur = new Author("Fanta", "kam@gmail.com", 'f');
		System.out.println("description de l'auteur : " + auteur.toString());

		Book book = new Book("ayayopougon", auteur, 548, 4);
		//book.toString();

		System.out.println(book);
	}
}
