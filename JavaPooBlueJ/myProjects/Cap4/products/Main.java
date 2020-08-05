public class Main{
	
	public static void main(String args[]){
		
		Product p1 = new Product(1,"Produto01");
		Product p2 = new Product(2,"Produto02");
		Product p3 = new Product(3,"Produto03");
		Product p4 = new Product(4,"Produto04");
		Product p5 = new Product(5,"Produto05");
		Product p6 = new Product(6,"Produto06");
		
		StockManager stock = new StockManager();
		
		stock.addProduct(p1);
		stock.addProduct(p2);
		stock.addProduct(p3);
		stock.addProduct(p4);
		stock.addProduct(p5);
		stock.addProduct(p6);
		stock.delivery(3,5);
		stock.delivery(2,19);
		stock.printProductDetails();
		System.out.println(stock.numberInStock(3));
	}
}
