package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import model.Repositorio;

public class ClienteController extends AbstractCrudController<view.Cliente, model.Cliente> {

    @FXML
    private TableView<view.Cliente> tabela;
    @FXML
    private TableColumn<view.Cliente, Integer> idCol;
    @FXML
    private TableColumn<view.Cliente, String> nomeCol;
    @FXML
    private TableColumn<view.Cliente, String> telefoneCol;
    @FXML
    private TableColumn<view.Cliente, String> emailCol;
    @FXML
    private TextField idField;
    @FXML
    private TextField nomeField;
    @FXML
    private TextField telefoneField;
    @FXML
    private TextField emailField;
    @FXML
    private Button adicionarButton;
    @FXML
    private Button atualizarButton;
    @FXML
    private Button deletarButton;
    @FXML
    private Button cancelarButton;
    @FXML
    private Button salvarButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initComponentes(tabela, idField, adicionarButton, atualizarButton,
                deletarButton, cancelarButton, salvarButton);
        super.initialize(location, resources);
    }

    @Override
    protected Repositorio<model.Cliente, Integer> getRepositorio() {
        return REPOSITORIOS.getClienteRepositorio();
    }

    @Override
    protected void configurarColunas() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nomeCol.setCellValueFactory(new PropertyValueFactory<>("nome"));
        telefoneCol.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
    }

    @Override
    protected void limparCampos() {
        idField.setText("");
        nomeField.setText("");
        telefoneField.setText("");
        emailField.setText("");
    }

    @Override
    protected void desabilitarCampos(boolean desabilitado) {
        nomeField.setDisable(desabilitado);
        telefoneField.setDisable(desabilitado);
        emailField.setDisable(desabilitado);
    }

    @Override
    protected void preencherCampos(view.Cliente item) {
        idField.setText(Integer.toString(item.getId()));
        nomeField.setText(item.getNome());
        telefoneField.setText(item.getTelefone());
        emailField.setText(item.getEmail());
    }

    @Override
    protected TextField getCampoFocoEdicao() {
        return nomeField;
    }

    @Override
    protected model.Cliente criarModelDosCampos() throws Exception {
        model.Cliente cliente = new model.Cliente();
        if (editando) {
            cliente.setId(Integer.parseInt(idField.getText()));
        }
        cliente.setNome(nomeField.getText());
        cliente.setTelefone(telefoneField.getText());
        cliente.setEmail(emailField.getText());
        return cliente;
    }

    @Override
    protected model.Cliente criarModelDaSelecao(view.Cliente selecionado) {
        model.Cliente cliente = new model.Cliente();
        cliente.setId(selecionado.getId());
        cliente.setNome(selecionado.getNome());
        cliente.setTelefone(selecionado.getTelefone());
        cliente.setEmail(selecionado.getEmail());
        return cliente;
    }

    @Override
    protected view.Cliente modelToView(model.Cliente cliente) {
        return new view.Cliente(
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEmail());
    }

    @Override
    protected void atualizarViewItem(view.Cliente viewItem, model.Cliente model) {
        viewItem.setNome(model.getNome());
        viewItem.setTelefone(model.getTelefone());
        viewItem.setEmail(model.getEmail());
    }

    @Override
    protected void validarCampos() throws IllegalArgumentException {
        String nome = nomeField.getText();
        String telefone = telefoneField.getText();
        String email = emailField.getText();

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("O telefone não pode ser vazio.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("O email não pode ser vazio.");
        }
    }

    @Override
    protected ObservableList<view.Cliente> carregarTodos() {
        ObservableList<view.Cliente> lista = FXCollections.observableArrayList();
        List<model.Cliente> listaFromDatabase = getRepositorio().loadAll();
        for (model.Cliente cliente : listaFromDatabase) {
            lista.add(modelToView(cliente));
        }
        return lista;
    }
}
