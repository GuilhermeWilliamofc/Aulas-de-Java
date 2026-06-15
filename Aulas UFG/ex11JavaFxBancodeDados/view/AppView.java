package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;

/**
 * Interface Grafica (GUI) do CRUD
 * 
 * @author marceloakira
 * @version 0.01
 */
public class AppView extends Application
{
    private FXMLLoader loader;
    private URL url;
    private Stage primaryStage;
    
    public AppView() {
        this.loader = new FXMLLoader();
        try {
            this.url = new File("view/app.fxml").toURI().toURL();
        } catch (Exception e) {
            System.out.println("Erro na carga do FXML:" + e);
        }
        this.loader.setLocation(this.url);        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root, 688, 596);
            this.primaryStage = primaryStage;
            primaryStage.setScene(scene);
            primaryStage.show();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void stop() {
        System.exit(0);
    }
    
    public void run(String[] args) {
        Application.launch(args);
    }
}