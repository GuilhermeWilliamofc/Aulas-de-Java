package controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import model.Repositorio;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class AbstractCrudController<V, M> implements Initializable {

    protected static final model.Database DATABASE = new model.Database("app.sqlite");
    protected static final model.Repositorios REPOSITORIOS = new model.Repositorios(DATABASE);

    protected boolean editando = false;

    protected TableView<V> tabela;
    protected TextField idField;
    protected Button adicionarButton;
    protected Button atualizarButton;
    protected Button deletarButton;
    protected Button cancelarButton;
    protected Button salvarButton;

    protected void initComponentes(
            TableView<V> tabela,
            TextField idField,
            Button adicionarButton,
            Button atualizarButton,
            Button deletarButton,
            Button cancelarButton,
            Button salvarButton) {
        this.tabela = tabela;
        this.idField = idField;
        this.adicionarButton = adicionarButton;
        this.atualizarButton = atualizarButton;
        this.deletarButton = deletarButton;
        this.cancelarButton = cancelarButton;
        this.salvarButton = salvarButton;
    }

    protected abstract Repositorio<M, Integer> getRepositorio();

    protected abstract void configurarColunas();

    protected abstract void limparCampos();

    protected abstract void desabilitarCampos(boolean desabilitado);

    protected abstract void preencherCampos(V item);

    protected abstract TextField getCampoFocoEdicao();

    protected abstract M criarModelDosCampos() throws Exception;

    protected abstract M criarModelDaSelecao(V selecionado);

    protected abstract V modelToView(M model);

    protected abstract void atualizarViewItem(V viewItem, M model);

    protected abstract void validarCampos() throws IllegalArgumentException;

    protected abstract ObservableList<V> carregarTodos();

    protected void desabilitarBotoes(
            boolean adicionar,
            boolean atualizar,
            boolean deletar,
            boolean cancelar,
            boolean salvar) {
        adicionarButton.setDisable(adicionar);
        atualizarButton.setDisable(atualizar);
        deletarButton.setDisable(deletar);
        cancelarButton.setDisable(cancelar);
        salvarButton.setDisable(salvar);
    }

    protected void resetarEstadoInicial() {
        editando = false;
        desabilitarCampos(true);
        desabilitarBotoes(false, true, true, true, true);
        limparCampos();
        tabela.getSelectionModel().clearSelection();
    }

    @FXML
    public void onAdicionarButtonAction() {
        editando = false;
        tabela.getSelectionModel().clearSelection();
        desabilitarCampos(false);
        desabilitarBotoes(true, true, true, false, false);
        limparCampos();
        getCampoFocoEdicao().requestFocus();
    }

    @FXML
    public void onAtualizarButtonAction() {
        V selecionado = tabela.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            editando = true;
            desabilitarCampos(false);
            desabilitarBotoes(true, true, true, false, false);
            getCampoFocoEdicao().requestFocus();
        }
    }

    @FXML
    public void onCancelarButtonAction() {
        resetarEstadoInicial();
    }

    @FXML
    public void onSalvarButtonAction() {
        try {
            validarCampos();
            M model = criarModelDosCampos();

            if (editando) {
                getRepositorio().update(model);

                V selecionado = tabela.getSelectionModel().getSelectedItem();
                if (selecionado != null) {
                    atualizarViewItem(selecionado, model);
                    tabela.refresh();
                }
            } else {
                M salvo = getRepositorio().create(model);
                V viewItem = modelToView(salvo);
                tabela.getItems().add(viewItem);
                tabela.getSelectionModel().select(viewItem);
            }

            resetarEstadoInicial();
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao salvar: " + e.getMessage()).show();
        }
    }

    @FXML
    public void onDeletarButtonAction() {
        V selecionado = tabela.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            try {
                getRepositorio().delete(criarModelDaSelecao(selecionado));
                tabela.getItems().remove(selecionado);
                resetarEstadoInicial();
            } catch (Exception e) {
                new Alert(AlertType.ERROR, "Erro ao deletar: " + e.getMessage()).show();
            }
        }
    }

    protected void onItemSelecionado(V newSelection) {
        if (newSelection != null) {
            preencherCampos(newSelection);
            desabilitarBotoes(false, false, false, true, true);
        } else {
            limparCampos();
            desabilitarBotoes(false, true, true, true, true);
        }
    }

    protected void initTabela() {
        tabela.setItems(carregarTodos());
        tabela.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldSelection, newSelection) -> onItemSelecionado(newSelection));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configurarColunas();
        initTabela();
    }
}
