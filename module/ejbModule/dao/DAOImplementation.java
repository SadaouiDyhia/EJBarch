package dao;
import java.util.List;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction; 
import entisties.Client;
import entisties.Film;
import entisties.RentedItem;
import entisties.StockItem;
import utils.JPAUtils;

public class DAOImplementation implements DAO {
private EntityManager entityManager=JPAUtils.getEntityManager("module");



public void ajouterClient(Client c){
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(c);
	tx.commit();
}

public void modifierClient(Client c){
EntityTransaction tx = entityManager.getTransaction();
tx.begin();
entityManager.merge(c);
tx.commit();
}


public void supprimerClient(Client c){
EntityTransaction tx = entityManager.getTransaction();
tx.begin();
c=entityManager.merge(c); // important
entityManager.remove(c);
tx.commit();
}


public Client consulterClient(Client c,Object id){
return entityManager.find(c.getClass(), id);
}


public List<Client> listerTousClient() { List<Client> clients =
		entityManager.createQuery("select c from Client c").getResultList();
		return clients;
}


public List<Client> listerParNom(String nom) {List<Client> clients =entityManager.createQuery( "select c from Client c where c.name like :pnom")
.setParameter("pnom","%"+nom+"%").getResultList();
return clients; }



@Override
public void ajouterStockItem(StockItem s) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(s);
	tx.commit();
	// TODO Auto-generated method stub
	
}



@Override
public void modifierStockItem(StockItem s) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.merge(s);
	tx.commit();
	
}



@Override
public void supprimerStockItem(StockItem s) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	s=entityManager.merge(s); // important
	entityManager.remove(s);
	tx.commit();
	
}



@Override
public void ajouterRentedItem(RentedItem r) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(r);
	tx.commit();
	
}



@Override
public void modifierRentedItem(RentedItem r) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.merge(r);
	tx.commit();
	
}



@Override
public void supprimerRentedItem(RentedItem r) {
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	r=entityManager.merge(r); // important
	entityManager.remove(r);
	tx.commit();
	
}



@Override
public double soldeClient(int clientId) {
	List<Client> clients =entityManager.createQuery( "select c from Client c where c.customerID = :clientid").setParameter("clientid",clientId).getResultList();
	return clients.get(0).getAccountBalance();
}



@Override
public boolean isCheckedOut(int articleID) {
	List<Client> clients =entityManager.createQuery( "select r from RentedItem c where r.itemID = :articleID").setParameter("articleID","%"+articleID+"%").getResultList();
	// TODO Auto-generated method stub
	return !clients.isEmpty();
}



@Override
public List<Film> listerFilmsParNom(String nom) {
	ArrayList<Film> films = new ArrayList<Film>();
	List<StockItem> clients =entityManager.createQuery( "select s from StockItem s").getResultList();
	for (StockItem item : clients) {
		if (item instanceof Film && (((Film)item).getActeur()==nom)) {
			films.add((Film)item);
		}
	}
	return films;
}



@Override
public List<RentedItem> listerOverdueRentedItems(String date) {
	List<RentedItem> items =entityManager.createQuery( "select r from RentedItem r where r.dueDate > :date ").setParameter("date",date).getResultList();
	return items;
}



@Override
public List<StockItem> listerItemsParTitre(String nom) {
	List<StockItem> clients =entityManager.createQuery( "select s from StockItem s where s.title like :nom ").setParameter("nom",nom).getResultList();
	return clients;
}



@Override
public List<RentedItem> listerTousRented() {
	List<RentedItem> items =entityManager.createQuery( "select r from RentedItem r").getResultList();
	return items;
}}