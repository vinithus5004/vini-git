import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (Vinicius Gabriel) 
 * @version (2020.06.05)
 */
public class Club
{
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
		members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Determine o número de membros que se associaram ao mês dado.
     * @param month O mês em que estamos interessados.
     * @return O número de membros que se associaram no mês.*/
    public int joinedInMonth(int month){
		
		int cont = 0;
		if(month>=1 && month<=12){
			
			for(Membership member : members){
				
				if(member.getMonth() == month){
					cont++;
				}
			}
		}
		else{
			System.out.println("Invalid Value.");
		}
		return cont;
	}
	/**
	 * Remove da coleção club todos os membros que se associaram no
	 * mês dado e os retornam armazenados em um objeto coleção separado.
	 * @param moth O mês da associação.
	 * @param year O ano da associação.
	 * @return Os membros que se associaram no mês e ano especificados.
	 * */
	public ArrayList<Membership> purge(int month, int year){
		
		ArrayList<Membership> purged = new ArrayList<Membership>();
		Iterator<Membership> it = members.iterator();
		if(month>=1 && month<=12){
			while(it.hasNext()){
				
				Membership member = it.next();
				if((member.getMonth() == month)&&(member.getYear() == year)){
					it.remove();
					purged.add(member);
				}
			}
		
		}
		else{
			System.out.println("Invalid Value.");
		}
		return purged;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
