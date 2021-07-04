package metier;

import javax.ejb.Remote;
import java.util.*;
import entisties.*; 

@Remote
public interface QueryProcessorRemote {
	public String hellowrld();
	public boolean findByTitle(String title);
	public List<String> findByActor(String acteur);
	public boolean isCheckedOut(int articleID);
	public double soldeClient(int clientId);

}
