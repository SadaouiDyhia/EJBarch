package application;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import services.ServiceRemote;
public class Main extends Application {
	
	
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("TP4");
        primaryStage.setScene(new Scene(root, 1100, 700));
        primaryStage.show();
    }
     
    public static Context ctx ; 

    public static void main(String[] args) throws NamingException {

        try {
			ctx = new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       //display all EJB in container 
		/*NamingEnumeration<NameClassPair> list = ctx.list("");
		while(list.hasMore()){
			System.out.println(list.next().getName()+" ");
		}*/
        
        launch(args);
    }
}
