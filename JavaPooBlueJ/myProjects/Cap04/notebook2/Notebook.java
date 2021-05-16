import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }
    /**
     * Remove uma nota do bloco de notas, de acordo com
     * o índice fornecido.
     * @param noteNumer O índice da anotação que deseja remover
     * da lista de anotações.
     */
    public void removeNote(int noteNumber)
    {
        if((noteNumber <= 0) || (noteNumber > numberOfNotes())){
            // This is not a valid note number, so do nothing.
        }
        else {
            notes.remove(noteNumber - 1);
        }
    }
    /**
     * Remove todas 
     * 
     */
    public void removeAllNotesWith(String searchString)
    {
        Iterator<String> it = notes.iterator();
        while(it.hasNext()){
            String note = it.next();
            if(note.contains(searchString)){
                it.remove();
            }
        }
    }
    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber <= 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber <= numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber - 1));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
    /**
     * Imprime a primeira nota que contém a String de pesquisa.
     * @param A String a ser pesquisada
     */
    public void search(String searchString)
    {
        int index = 0;
        boolean found = false;
        while(index < notes.size() && !found){
            String note = notes.get(index);
            if(note.contains(searchString)){
                found = true;
                System.out.println(note);
            }
            else{
                index++;
            }
        }
        if(index == notes.size())
        {
            System.out.println("Search term not found");
        }
    }
    /**
     * Lista todas as anotações e o seu respectivo índice.
     */
    public void listNotes()
    {
        Iterator<String> it = notes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
