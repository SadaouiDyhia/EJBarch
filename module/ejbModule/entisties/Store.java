package entisties;

import java.io.Serializable;

import java.util.*;

import javax.persistence.Entity;

import metier.QueryProcessor;
import metier.TransactionProcessor;


public class Store {
	public static Map<String, Client> clients = new HashMap<String, Client>();
	public static Map<String, StockItem> stockItems = new HashMap<String, StockItem>();
	public static List<RentedItem> rentedItems = new ArrayList<RentedItem>();
	public static int idClients;
	public static int idItems;
	public QueryProcessor qp;
	public TransactionProcessor tp;
	
	public Store()
	{
		idClients = 0;
		idItems = 0;
		this.qp = new QueryProcessor();
		this.tp = new TransactionProcessor();
	}
}

