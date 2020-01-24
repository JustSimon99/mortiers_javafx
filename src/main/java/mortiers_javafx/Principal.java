package mortiers_javafx;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
	
	static {
		J.appel(Principal.class);
		
		Initialisateur.initialiser();
		
	}
	
	public static void main(String[] args) {
		J.appel(Principal.class);
		
		launch(args);
	}
	
	@Override
	public void start(Stage fenetrePrincipal) throws Exception {
		J.appel(Principal.class);
		
		Scene scene = creerScenePrincipal();
		
		fenetrePrincipal.setScene(scene);
		
		fenetrePrincipal.show();
		
	}
	
	private Scene creerScenePrincipal() {
		J.appel(Principal.class);
		
		ChargeurDeVue chargeur = new ChargeurDeVue("/fxml/principal.xml");
		
		Scene scene = chargeur.nouvelleScene(600, 400);
		
		DoitEtre.nonNul(scene);
		
		return scene;
	}
	
	public void stop() {
		J.appel(this);
		
	}
}