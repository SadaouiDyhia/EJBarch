package dao;

import java.util.List;


import entisties.Client;
import entisties.Film;
import entisties.RentedItem;
import entisties.StockItem;

public interface DAO {
	public void ajouterClient(Client c);
	public void modifierClient(Client c);
	public void supprimerClient(Client c);
	public void ajouterStockItem(StockItem s);
	public void modifierStockItem(StockItem s);
	public void supprimerStockItem(StockItem s);
	public void ajouterRentedItem(RentedItem r);
	public void modifierRentedItem(RentedItem r);
	public void supprimerRentedItem(RentedItem r);
	public Client consulterClient(Client c,Object id);
	public double soldeClient(int clientId);
	public boolean isCheckedOut(int articleID);
	public List<Client> listerTousClient();
	public List<RentedItem> listerTousRented();
	public List<Film> listerFilmsParNom(String nom);
	public List<RentedItem> listerOverdueRentedItems(String date);
	public List<StockItem> listerItemsParTitre(String nom);
	
}
