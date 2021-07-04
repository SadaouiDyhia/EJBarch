package metier;
import java.util.*;

import javax.ejb.Remote;

public interface TransactionProcessorRemote {
	public void CheckOut(int articleID, int clientID, String date);
	public void CheckIn(int articleID, int clientID, String date);
	public void AddCustomer(String name, double accountBalance);
	public void AddStockItem(double rentalPrice, String title, boolean isGame, String plateforme, String acteur);
	
}
