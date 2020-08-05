public class Main{
	
	public static void main(String args[]){
		
		Auction leilao = new Auction();
		Person p1 = new Person("Joaquin");
		Person p2 = new Person("Maria");
		Person p3 = new Person("Roberto");
		
		leilao.enterLot("Carro Ford");
		leilao.enterLot("Piscina Movel");
		leilao.enterLot("Conjunto de sapatos");
		leilao.enterLot("Bicicleta");
		leilao.enterLot("Moto Honda");
		
		leilao.bidFor(4,p2,23);
		leilao.bidFor(4,p3,19);
		leilao.bidFor(4,p1,39);
		leilao.bidFor(1,p2,6400);
		
		
		leilao.showLots();
		leilao.removeLot(3);
		leilao.showLots();
	}
}
