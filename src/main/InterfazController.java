/*
 * Interfaz para el Controlador del Proyecto. 
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
public class InterfazController implements Initializable {

    @FXML
    private Button BtnGestionarOrg;
    @FXML
    private Button BtnGestionarUsuarios;
    @FXML
    private Button BtnGestionarUsuarios1;
    @FXML
    private Button BtnGestionarSolicituddePrestamos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void GestionarOrganizaciones (ActionEvent event) {
       try {
         //Carga de la Vista.
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/GestionarOrganización.fxml"));
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

    @FXML
    private void GestionarUsuarios(ActionEvent event) {
            try {
         //Carga de la Vista.
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/GestionarUsuarios.fxml"));
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

    @FXML
    private void GestionarRecursos(ActionEvent event) {
                 try {
         //Carga de la Vista.
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/GestionarRecursos.fxml"));
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

    @FXML
    private void GestionarSolicituddePrestamos(ActionEvent event) {
                         try {
         //Carga de la Vista.
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/GestionarSolicitudPréstamo.fxml"));
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

   

