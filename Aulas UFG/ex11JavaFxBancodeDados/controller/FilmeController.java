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

public class FilmeController extends AbstractCrudController<view.Filme, model.Filme> {

    @FXML
    private TableView<view.Filme> tabela;
    @FXML
    private TableColumn<view.Filme, Integer> idCol;
    @FXML
    private TableColumn<view.Filme, String> tituloCol;
    @FXML
    private TableColumn<view.Filme, String> generoCol;
    @FXML
    private TableColumn<view.Filme, Integer> anoCol;
    @FXML
    private TextField idField;
    @FXML
    private TextField tituloField;
    @FXML
    private TextField generoField;
    @FXML
    private TextField anoField;
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
    protected Repositorio<model.Filme, Integer> getRepositorio() {
        return REPOSITORIOS.getFilmeRepositorio();
    }

    @Override
    protected void configurarColunas() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        tituloCol.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        generoCol.setCellValueFactory(new PropertyValueFactory<>("genero"));
        anoCol.setCellValueFactory(new PropertyValueFactory<>("ano"));
    }

    @Override
    protected void limparCampos() {
        idField.setText("");
        tituloField.setText("");
        generoField.setText("");
        anoField.setText("");
    }

    @Override
    protected void desabilitarCampos(boolean desabilitado) {
        tituloField.setDisable(desabilitado);
        generoField.setDisable(desabilitado);
        anoField.setDisable(desabilitado);
    }

    @Override
    protected void preencherCampos(view.Filme item) {
        idField.setText(Integer.toString(item.getId()));
        tituloField.setText(item.getTitulo());
        generoField.setText(item.getGenero());
        anoField.setText(Integer.toString(item.getAno()));
    }

    @Override
    protected TextField getCampoFocoEdicao() {
        return tituloField;
    }

    @Override
    protected model.Filme criarModelDosCampos() throws Exception {
        model.Filme filme = new model.Filme();
        if (editando) {
            filme.setId(Integer.parseInt(idField.getText()));
        }
        filme.setTitulo(tituloField.getText());
        filme.setGenero(generoField.getText());
        filme.setAno(Integer.parseInt(anoField.getText()));
        return filme;
    }

    @Override
    protected model.Filme criarModelDaSelecao(view.Filme selecionado) {
        model.Filme filme = new model.Filme();
        filme.setId(selecionado.getId());
        filme.setTitulo(selecionado.getTitulo());
        filme.setGenero(selecionado.getGenero());
        filme.setAno(selecionado.getAno());
        return filme;
    }

    @Override
    protected view.Filme modelToView(model.Filme filme) {
        return new view.Filme(
                filme.getId(),
                filme.getTitulo(),
                filme.getGenero(),
                filme.getAno());
    }

    @Override
    protected void atualizarViewItem(view.Filme viewItem, model.Filme model) {
        viewItem.setTitulo(model.getTitulo());
        viewItem.setGenero(model.getGenero());
        viewItem.setAno(model.getAno());
    }

    @Override
    protected void validarCampos() throws IllegalArgumentException {
        String titulo = tituloField.getText();
        String genero = generoField.getText();
        String anoStr = anoField.getText();

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("O gênero não pode ser vazio.");
        }
        try {
            Integer.parseInt(anoStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("O ano deve ser um número inteiro válido.");
        }
    }

    @Override
    protected ObservableList<view.Filme> carregarTodos() {
        ObservableList<view.Filme> lista = FXCollections.observableArrayList();
        List<model.Filme> listaFromDatabase = getRepositorio().loadAll();
        for (model.Filme filme : listaFromDatabase) {
            lista.add(modelToView(filme));
        }
        return lista;
    }
}
