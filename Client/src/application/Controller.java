package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import services.ServiceRemote;

import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import application.*;
import metier.* ; 


public class Controller implements Initializable {
	//QueryProcessor query = new QueryProcessor(); 
	//TransactionProcessor trans = new TransactionProcessor();
    String filmacteur;
    String itemloueclient;
    String itemdispo;
    String soldeclient;

    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;



    @FXML
    TextField textefilmacteur;
    @FXML
    TextField textetrouverarticle;
    @FXML
    TextField textefilmloue;
    @FXML
    TextField textesoldeclient;


    @FXML
    TextField checkinclientid;
    @FXML
    TextField checkinitemid;
    @FXML
    TextField checkoutclientid;
    @FXML
    TextField checkoutitemid;
    @FXML
    TextField checkoutdate;
    @FXML
    TextField ajouteritype;
    @FXML
    TextField ajouteriplatforme;
    @FXML
    TextField ajouteriacteur;
    @FXML
    TextField ajouteriprixpourlouer;
    @FXML
    TextField ajouterititre;
    @FXML
    TextField ajouteriitemid;
    @FXML
    TextField ajoutercacoountbalance;
    @FXML
    TextField ajoutercnom;
    @FXML
    TextField ajoutercid;

    @FXML
    ListView<String> listview ;

    
    

    ObservableList<String> listeF = FXCollections.observableArrayList();
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
    	
		
	}
	
	
	@FXML
    public void findFilmActeur() throws NamingException{
		
		
		 
    	//ServiceRemote a = (ServiceRemote) Main.ctx.lookup("services.ServiceRemote#services.ServiceRemote");	
		QueryProcessorRemote a = (QueryProcessorRemote) Main.ctx.lookup("metier.QueryProcessorRemote#metier.QueryProcessorRemote");
		System.out.print(a.hellowrld());
		
		/*
        filmacteur = textefilmacteur.getText();

        //fonction 2eme couche :
        listeF.addAll( query.findByActor(filmacteur));
        listview.setItems(listeF);
*/

    }

    @FXML
    public void soldeClient(){/*
        soldeclient = textesoldeclient.getText();
        double d = query.soldeClient(Integer.parseInt(soldeclient)) ;
        listeF.add( Double.toString(d) );
        listview.setItems(listeF);
        */
    }

    @FXML
    public void trouverArticle(){/*
        s1 = textetrouverarticle.getText();
        listeF.add( Boolean.toString(query.findByTitle(s1)));
        listview.setItems(listeF);
*/
    }

    @FXML
    public void ischeckedoutfilm(){/*
        itemloueclient = textetrouverarticle.getText();

        listeF.add( Boolean.toString(query.isCheckedOut(Integer.parseInt(s1))) );
        listview.setItems(listeF);
*/
    }



    @FXML
    public void chackoutArticle(){/*

    	trans.CheckOut(Integer.parseInt(checkoutitemid.getText()), Integer.parseInt(checkoutclientid.getText()), checkoutdate.getText());
*/
    }

    @FXML
    public void checkinArticle(){/*
    	trans.CheckIn(Integer.parseInt(checkinitemid.getText()), Integer.parseInt(checkinclientid.getText()), "01012000");
*/
    }


    @FXML
    public void ajouterItem(){/*
        boolean b = false ;
        if( ajouteritype.getText().equals("jeu")){b = true; }
        trans.AddStockItem(Double.parseDouble(ajouteriprixpourlouer.getText()), ajouterititre.getText(), b, ajouteriplatforme.getText(), ajouteriacteur.getText());
    */
    }
    

    @FXML
    public void ajouterClient(){/*
    	trans.AddCustomer(ajoutercnom.getText(), Double.parseDouble(ajoutercacoountbalance.getText()));
    */
    }
    

    @FXML
    public void overdue(){


    }



}

