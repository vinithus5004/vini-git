public class Main{
	
	public static void main(String args[]){
		
		Notebook1 notepad = new Notebook1();
		
		System.out.println(notepad.numberOfNotes()); 
		notepad.storeNote("Hi!");
		notepad.storeNote("Hello, world!!");
		notepad.storeNote("Dattebayo!!");
		notepad.storeNote("Baka");
		notepad.storeNote("Nice to meet you.");
		
		System.out.println(notepad.numberOfNotes());
		notepad.removeNote(7);
		System.out.println(notepad.numberOfNotes());
		
		notepad.search("H");
		notepad.listAllNotes();
		
	}
}
