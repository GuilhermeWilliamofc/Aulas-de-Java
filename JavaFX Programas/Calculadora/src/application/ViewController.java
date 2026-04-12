package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML private TextField numero1; // vai pegar o campo de texto com o id numero1
	@FXML private TextField numero2;
	@FXML private Button calcular;
	@FXML private Label resultado;
	
	@FXML
	public void onButtonAction() { // quando clicar no botao, vai ser o metodo que vai ser ativado quando clicar
		int conteudo1 = Integer.parseInt(numero1.getText()); // transforma em int para poder somar
		int conteudo2 = Integer.parseInt(numero2.getText());
		int soma = conteudo1 + conteudo2;
		resultado.setText(Integer.toString(soma)); // devolve o resultado para string para poder mostrar, como é uma ação n precisa guardar numa variavel
	}
}
