package metier;

import java.util.*;
import javax.ejb.Stateless;
import entisties.*; 
import dao.*; 

/**
 * Session Bean implementation class QueryProcessor
 */

@Stateless
public class QueryProcessor implements QueryProcessorRemote {

	 DAOImplementation sgbd = new DAOImplementation();
    
	public QueryProcessor(){
		DAOImplementation sgbd = new DAOImplementation();
		
	}
	
	@Override
	public String hellowrld() {
		// TODO Auto-generated method stub
		return "hello World !" ; 
	}
	
	
	public boolean findByTitle(String title)
	{
		List<StockItem> results = new ArrayList<StockItem>();
		
		results= sgbd.listerItemsParTitre(title);
		
		if (results==null) return false;
		return results.isEmpty();
	}
	
	public List<String> findByActor(String acteur)
	{
		
		
		//ArrayList<Film> films = new ArrayList<Film>(); 
		ArrayList<String> res = new ArrayList<String>();
 		for (Film f : sgbd.listerFilmsParNom(acteur)) {
			res.add(f.getTitle());
		}
		return res;
	}
	
	public boolean isCheckedOut(int articleID)
	{
		return sgbd.isCheckedOut(articleID);
	}
	
	public double soldeClient(int clientId)
	{
		return sgbd.soldeClient(clientId);
	}
	
	public ArrayList<StockItem> overdueItems()
	{
		//Problem with eclipseLink 2.5 check following link: https://stackoverflow.com/questions/12364051/merge-an-entity-change-its-id-merge-again-cause-mapped-to-a-primary-key-colu
		DAOImplementation sgbd = new DAOImplementation();
		Date currentDate = new Date();
	    List<RentedItem> elements =  sgbd.listerTousRented();
		ArrayList<StockItem> liste = new ArrayList<StockItem>();
		for (RentedItem element: Store.rentedItems) {
			if (element.getDueDate().compareTo(currentDate.toGMTString())<0) {
				int id = element.getItemID();
				for (String title : Store.stockItems.keySet()) {
					StockItem item = Store.stockItems.get(title);
					if (item.getItemID()==id) {
						liste.add(item);
						break;
					}
				}
			}
		}
		return liste;
	}


}
