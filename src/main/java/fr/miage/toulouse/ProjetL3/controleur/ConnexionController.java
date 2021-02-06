package fr.miage.toulouse.ProjetL3.controleur;

import fr.miage.toulouse.ProjetL3.App;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author ElieTreport
 */
public class ConnexionController implements Initializable {

	// Différent composant récupérer de notre classe Connexion.fxml
	@FXML
	private ComboBox<String> cmb_droit;
	@FXML
	private Text infoConnexion;
	@FXML
	private TextField txtBUserId, txtBMotDePasse;

	// Observable permettant de compléter notre liste déroulante
	private ObservableList<String> listRole = FXCollections.observableArrayList("Directeur d'étude",
			"Secréteriat pédagogique", "Bureau des examens");

	/**
	 * Initializes the controller class.
	 * 
	 * @param url
	 * @param rb
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		cmb_droit.setItems(listRole);
	}

	@FXML
	private void verifConnexion() {
		if (txtBUserId.getText().length() > 0 && txtBMotDePasse.getText().length() > 0
				&& cmb_droit.getValue() != null) {
			if (txtBUserId.getText().equals("Test") && txtBMotDePasse.getText().equals("Test")) {
				try {
					App.setRoot("ListeEtudiants");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				infoConnexion.setVisible(true);
				infoConnexion.setText("Le mot de passe est incorrect");
			}
		} else {
			infoConnexion.setVisible(true);
			infoConnexion.setText("Veuillez renseigner l'ensemble des champs");
		}
	}

}
