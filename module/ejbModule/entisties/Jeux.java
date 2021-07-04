package entisties;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Jeux extends StockItem implements Serializable {
	private String plateforme;
	public Jeux(){}
	
	public Jeux(double rentalPrice, String title, int itemID, String plateforme)
	{
		super(rentalPrice, title, itemID);
		this.plateforme = plateforme;
	}

	public String getPlateforme() {
		return plateforme;
	}

	public void setPlateforme(String plateforme) {
		this.plateforme = plateforme;
	}
}

