public class Main{

	public static void main(String args[]){
	
		Book b1 = new Book("Jubaldo","As morangas",320);
		
		b1.setRefNumber("128");
		b1.borrow();
		b1.borrow();
		b1.printDetails();
	}
}
