import java.util.ArrayList;
import java.util.Iterator;

public class Notebook1{
	
	private ArrayList<String> notes;
	
	public Notebook1(){
		
		notes = new ArrayList<String>();
	}
	public void storeNote(String note){
		
		notes.add(note);
	}
	public int numberOfNotes(){
		
		return notes.size();
	}
	public void showNote(int index){
		
		if(index<0){}
		else if(index < numberOfNotes()){
			System.out.println(notes.get(index));
		}
		else{}
	}
	public void removeNote(int index){
		
		if(index < 0){}
		else if(index>0 && index < numberOfNotes()){
			notes.remove(index);
		}
		else {}
	}
	public void listAllNotes(){
		
		Iterator<String> it = notes.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public void search(String searchString){
		
		int index = 0;
		boolean found = false;
		while(index<numberOfNotes() && !found){
			
			String note = notes.get(index);	
			if(note.contains(searchString)){
				System.out.println(notes.get(index));
				found = true;
			}	
			else{
				index++;
			}
		}
		if(index == numberOfNotes()){
			System.out.println("Search term not found");
		}
	}
	public void removeNotes(String word){
		
		Iterator<String> it = notes.iterator();
		while(it.hasNext()){
			
			String note = it.next();
			if(note.contains(word)){
				it.remove();
			}
		}
	}
	
	
	
}
