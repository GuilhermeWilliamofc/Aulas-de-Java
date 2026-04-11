package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	@FXML
	private Button btrosa;
	
	@FXML
	public void onBtrosaAction() {
		Alerts.showAlerts("Meu titulo", "Meu Cabeçalho", "Olá, tudo bem com você?", AlertType.INFORMATION);
	}
}
