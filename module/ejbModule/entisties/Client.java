package entisties;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client implements Serializable{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
//pour autoincrement
private int customerID;
private String name; 
private double accountBalance;

public Client(){}

public Client(double accountBalance, String name)
{
	this.accountBalance = accountBalance;
	this.name = name;
	//this.customerID = customerID;
}
public double getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getCustomerID() {
	return customerID;
}

public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
}