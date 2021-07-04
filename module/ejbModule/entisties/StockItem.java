package entisties;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StockItem implements Serializable{
	private double rentalPrice;
	private String title;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int itemID;
	
	public StockItem(){}
	
	
	public StockItem(double rentalPrice, String title, int itemID)
	{
		this.rentalPrice = rentalPrice;
		this.title = title;
		this.itemID = itemID;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
}
