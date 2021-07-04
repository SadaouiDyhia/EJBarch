package metier;


import java.util.Date;

import javax.ejb.Stateless;

import dao.DAOImplementation;
import entisties.*;

@Stateless
public class TransactionProcessor implements TransactionProcessorRemote  {
	
	public void CheckOut(int articleID, int clientID, String date)
	{
		DAOImplementation sgbd = new DAOImplementation();
		sgbd.ajouterRentedItem(new RentedItem(clientID, articleID, date));
		//Store.rentedItems.add(new RentedItem(clientID, articleID, date));
	}
	
	public void CheckIn(int articleID, int clientID, String date)
	{
		DAOImplementation sgbd = new DAOImplementation();
		sgbd.supprimerRentedItem(new RentedItem(clientID, articleID, date));
	
	}
	
	public void AddCustomer(String name, double accountBalance)
	{
		DAOImplementation sgbd = new DAOImplementation();
		sgbd.ajouterClient(new Client( accountBalance, name));
	}
	
	public void AddStockItem(double rentalPrice, String title, boolean isGame, String plateforme, String acteur)
	{
		DAOImplementation sgbd = new DAOImplementation();
		if (isGame) {
			sgbd.ajouterStockItem(new Jeux(rentalPrice, title, Store.idItems, plateforme));
			//Store.stockItems.put(title, new Jeux(rentalPrice, title, Store.idItems, plateforme));
		}
		else {
			sgbd.ajouterStockItem(new Film(rentalPrice, title, Store.idItems, plateforme));
			//Store.stockItems.put(title, new Film(rentalPrice, title, Store.idItems, acteur));
		}
	}

}
