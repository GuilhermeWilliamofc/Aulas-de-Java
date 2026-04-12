package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.concurrent.ThreadLocalRandom;

public class ViewController {
	@FXML private Label numerogerado;
	@FXML private TextField numero1;
	@FXML private TextField numero2;
	
	@FXML
	public void onBotaoAction() {
		if (numero1.getText().isBlank() || numero2.getText().isBlank()) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setContentText("Preencha todos os campos antes de gerar o numero!");
			
			alert.showAndWait();
		}
		else {
			int numero1int = Integer.parseInt(numero1.getText());
			int numero2int = Integer.parseInt(numero2.getText());
			
			if (numero1int < 0 || numero2int < 0) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Numero Negativo");
				alert.setContentText("O numero nao pode ser negativo!");
				
				alert.showAndWait();
			}
			else if (numero1int > numero2int) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Erro");
				alert.setContentText("O primeiro numero nao pode ser maior que o segundo!");
				
				alert.showAndWait();
			}
			else {
				//Gera um número entre 10 (inclusive) e 100 (exclusive)
				int num = ThreadLocalRandom.current().nextInt(numero1int, numero2int);
				numerogerado.setText(Integer.toString(num));
			}
		}
	}
}
