package entisties;
import java.io.Serializable;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RentedItem implements Serializable {
	private int customerID; 
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int itemID; 
	private String dueDate;
	
	public RentedItem(){}
	
	public RentedItem(int customerID, int itemID, String dueDate)
	{
		this.customerID = customerID;
		this.itemID = itemID;
		this.dueDate = dueDate;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
}
