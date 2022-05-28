/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luis Angel Díaz
 */
public class GestionarSolicitudPréstamoController implements Initializable {

    @FXML
    private Button BtnReservarelRecurso;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReservarElRecurso(ActionEvent event) {
         try {
         //Carga de la Vista.
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ReservarRecurso.fxml"));
         //Carga de la Ventana.
         Parent root = loader.load();
         
         //Creación del Scene.
         Scene scene = new Scene (root);
         Stage stage = new Stage();
         stage.initModality(Modality.APPLICATION_MODAL);
         stage.setScene(scene);
         stage.setResizable(false);
         stage.showAndWait();
         
        } catch (IOException ex){
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }    
    }
}
    
