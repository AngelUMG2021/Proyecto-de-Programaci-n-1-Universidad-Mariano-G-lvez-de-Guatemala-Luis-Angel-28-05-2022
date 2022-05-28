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
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luis Angel Díaz
 */
public class ModificarOrganizaciónController implements Initializable {

    @FXML
    private TextField BTNDireccionModoficacion;
    @FXML
    private TextField BTNNumeroTel;
    @FXML
    private TextField BTNCorreoElect;
    @FXML
    private Button BTNGuardarDatosModificados;
    @FXML
    private Button BTNCrearOrganizacion1;
    @FXML
    private TextField BTNCodigoOrg;
    @FXML
    private TextField BTNNombreOrg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void modficarorganizacion(ActionEvent event) {
    }

    @FXML
    private void BTNGuardarDatosModificados(ActionEvent event) {
    }

    @FXML
    private void MODIFICARUSUARIOADMINISTRADOR(ActionEvent event) {
                        try {
         //Carga de la Vista.
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CrearUsuarioAdministrador.fxml"));
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
    private void CodigoOrgNOSEPUEDEMODIFICAR(ActionEvent event) {
    }

    @FXML
    private void NombreOrgNOSEPUEDEMODIFICAR(ActionEvent event) {
    }
}
    

