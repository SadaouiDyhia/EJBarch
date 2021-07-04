package entisties;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Film extends StockItem  implements Serializable{
	private String acteur;
	public Film()
	{
	}
	
	public Film(double rentalPrice, String title, int itemID, String acteur)
	{
		super(rentalPrice, title, itemID);
		this.acteur = acteur;
	}
	
	public String getActeur() {
		return acteur;
	}

	public void setActeur(String acteur) {
		this.acteur = acteur;
	}
}
