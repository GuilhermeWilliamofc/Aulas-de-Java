package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.List;

import model.FilmeRepositorio;
import view.AppView;

public class AppController implements Initializable {
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
    
    private AppView appView;
    private boolean editando = false;
    
    private static model.Database database = new model.Database("app.sqlite");
    private static model.FilmeRepositorio filmeRepo = new model.FilmeRepositorio(database);
        
    public AppController() {
        this.appView = new AppView();
    }
    
    public static void main(String[] args) throws Exception {
        AppController appController = new AppController();
        appController.appView.run(args);
    }
    
    private void desabilitarBotoes(boolean adicionar, boolean atualizar, boolean deletar, boolean cancelar, boolean salvar) {
        adicionarButton.setDisable(adicionar);
        atualizarButton.setDisable(atualizar);
        deletarButton.setDisable(deletar);
        cancelarButton.setDisable(cancelar);
        salvarButton.setDisable(salvar);        
    }
    
    private void desabilitarCampos(boolean desabilitado) {
        tituloField.setDisable(desabilitado);
        generoField.setDisable(desabilitado);
        anoField.setDisable(desabilitado);
    }
    
    private void limparCampos() {
        idField.setText("");
        tituloField.setText("");
        generoField.setText("");
        anoField.setText("");        
    }
    
    @FXML
    public void onCancelarButtonAction() {
        editando = false;
        desabilitarCampos(true);
        desabilitarBotoes(false, true, true, true, true);
        limparCampos();
        tabela.getSelectionModel().clearSelection();        
    }
    
    @FXML
    public void onSalvarButtonAction() {
        try {
            String titulo = tituloField.getText();
            String genero = generoField.getText();
            String anoStr = anoField.getText();
            
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new IllegalArgumentException("O título não pode ser vazio.");
            }
            if (genero == null || genero.trim().isEmpty()) {
                throw new IllegalArgumentException("O gênero não pode ser vazio.");
            }
            int ano;
            try {
                ano = Integer.parseInt(anoStr);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("O ano deve ser um número inteiro válido.");
            }
            
            if (editando) {
                // Modo Edição/Atualização
                int id = Integer.parseInt(idField.getText());
                model.Filme filme = new model.Filme();
                filme.setId(id);
                filme.setTitulo(titulo);
                filme.setGenero(genero);
                filme.setAno(ano);
                
                filmeRepo.update(filme);
                
                // Atualizar na tabela
                view.Filme filmeSelecionado = tabela.getSelectionModel().getSelectedItem();
                if (filmeSelecionado != null) {
                    filmeSelecionado.setTitulo(titulo);
                    filmeSelecionado.setGenero(genero);
                    filmeSelecionado.setAno(ano);
                    tabela.refresh();
                }
            } else {
                // Modo Criação/Adição
                model.Filme filme = new model.Filme();
                filme.setTitulo(titulo);
                filme.setGenero(genero);
                filme.setAno(ano);
                
                model.Filme filmeSalvo = filmeRepo.create(filme);
                view.Filme filmeView = modelToView(filmeSalvo);
                tabela.getItems().add(filmeView);
                tabela.getSelectionModel().select(filmeView);
            }
            
            editando = false;
            desabilitarCampos(true);
            desabilitarBotoes(false, true, true, true, true);
            limparCampos();
            tabela.getSelectionModel().clearSelection();
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao salvar: " + e.getMessage()).show();
        }
    }    
    
    @FXML
    public void onAdicionarButtonAction() {
        editando = false;
        tabela.getSelectionModel().clearSelection();
        desabilitarCampos(false);
        desabilitarBotoes(true, true, true, false, false);
        limparCampos();
        tituloField.requestFocus();
    }
    
    @FXML
    public void onAtualizarButtonAction() {
        view.Filme selecionado = tabela.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            editando = true;
            desabilitarCampos(false);
            desabilitarBotoes(true, true, true, false, false);
            tituloField.requestFocus();
        }
    }
    
    @FXML
    public void onDeletarButtonAction() {
        view.Filme selecionado = tabela.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            try {
                model.Filme filme = new model.Filme();
                filme.setId(selecionado.getId());
                filme.setTitulo(selecionado.getTitulo());
                filme.setGenero(selecionado.getGenero());
                filme.setAno(selecionado.getAno());
                
                filmeRepo.delete(filme);
                tabela.getItems().remove(selecionado);
                limparCampos();
                desabilitarBotoes(false, true, true, true, true);
                desabilitarCampos(true);
            } catch (Exception e) {
                new Alert(AlertType.ERROR, "Erro ao deletar: " + e.getMessage()).show();
            }
        }
    }

    private void handleFilmeSelected(view.Filme newSelection) {
        if (newSelection != null) {
            idField.setText(Integer.toString(newSelection.getId()));
            tituloField.setText(newSelection.getTitulo());
            generoField.setText(newSelection.getGenero());
            anoField.setText(Integer.toString(newSelection.getAno()));
            desabilitarBotoes(false, false, false, true, true);
        } else {
            limparCampos();
            desabilitarBotoes(false, true, true, true, true);
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        tituloCol.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        generoCol.setCellValueFactory(new PropertyValueFactory<>("genero"));
        anoCol.setCellValueFactory(new PropertyValueFactory<>("ano"));
        
        tabela.setItems(loadAllFilmes());
        tabela.getSelectionModel().selectedItemProperty().addListener(
            (observableValue, oldSelection, newSelection) -> {
                handleFilmeSelected(newSelection);
            });
    }
    
    private view.Filme modelToView(model.Filme filme) {
        return new view.Filme(
            filme.getId(),
            filme.getTitulo(),
            filme.getGenero(),
            filme.getAno()
        );
    }
    
    private ObservableList<view.Filme> loadAllFilmes() {
        ObservableList<view.Filme> lista = FXCollections.observableArrayList();
        List<model.Filme> listaFromDatabase = filmeRepo.loadAll();
        for(model.Filme filme: listaFromDatabase) {
            lista.add(modelToView(filme));
        }
        return lista;
    }
}
