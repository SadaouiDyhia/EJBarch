package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction; 
import entisties.Client;
import utils.JPAUtils;

//classe contenant les méthodes génériques ajouter, supprimer, consulter par clé primaire (Id)
public class ClientDAO {
private EntityManager entityManager=JPAUtils.getEntityManager("TP3");
//méthode ajouter d'une entité à la bd public void ajouter(Clientc)
public void ajouter(Client c){
	EntityTransaction tx = entityManager.getTransaction();
tx.begin();
entityManager.persist(c);
tx.commit();
}
//méthode modifier d'une entité à partir de la bd public void modifier(Client c)
public void modifier(Client c){
EntityTransaction tx = entityManager.getTransaction();
tx.begin();
entityManager.merge(c);
tx.commit();
}
//méthode Supprimer d'une entité à partir de la bd
public void supprimer(Client c){
EntityTransaction tx = entityManager.getTransaction();
tx.begin();
c=entityManager.merge(c); // important
entityManager.remove(c);
tx.commit();
}
//méthode Consulter d'une entité à partir de la bd 
public Client consulter(Client c,Object id){
return entityManager.find(c.getClass(), id);
}
//méthode pour lister tous les objets à partir de la bd 

public List<Client> listerTous() { List<Client> clients =
		entityManager.createQuery("select c from Client c").getResultList();
		return clients;
}
//méthode pour lister tous les client dont le nom contient un //texte donné en paramètre (pnom)

public List<Client> listerParNom(String nom) {List<Client> clients =entityManager.createQuery( "select c from Client c where c.name like :pnom")
.setParameter("pnom","%"+nom+"%").getResultList();
return clients; }}