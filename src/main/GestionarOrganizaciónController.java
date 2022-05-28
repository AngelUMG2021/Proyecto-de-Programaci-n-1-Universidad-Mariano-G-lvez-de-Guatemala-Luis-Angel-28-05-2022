/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Luis Angel Díaz
 */
public class GestionarOrganizaciónController implements Initializable {

    @FXML
    private Button BtnCrearOrganizacion;
    @FXML
    private Button BtnModificarOrganizacion;
    @FXML
    private Button BtnInactivarActivarOrganizacion;
    
     /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
   
    @FXML
     private void crearorganizacion (ActionEvent event){
        try {
         //Carga la Vista.
         FXMLLoader loader = new FXMLLoader (getClass ().getResource ("/vista/CrearOrganización.fxml"));
         //Carga la Ventana. 
         Parent root = loader.load ();
         
         //Creación del Scene. 
         Scene scene  = new Scene (root);
         Stage stage  = new Stage ();
         stage.initModality (Modality.APPLICATION_MODAL);
         stage.setScene(scene);
         stage.setResizable(false);
         stage.showAndWait();
        } catch (IOException ex){
            Logger.getLogger(GestionarOrganizaciónController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    @FXML
    private void modificarorganizacion(ActionEvent event) {
         try {
         //Carga la Vista.
         FXMLLoader loader = new FXMLLoader (getClass ().getResource ("/vista/ModificarOrganización.fxml"));
         //Carga la Ventana. 
         Parent root = loader.load ();
         
         //Creación del Scene. 
         Scene scene  = new Scene (root);
         Stage stage  = new Stage ();
         stage.initModality (Modality.APPLICATION_MODAL);
         stage.setScene(scene);
         stage.setResizable(false);
         stage.showAndWait();
        } catch (IOException ex){
            Logger.getLogger(GestionarOrganizaciónController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    @FXML
    private void InactivarActivarOrganizacion(ActionEvent event) {
             try {
         //Carga la Vista.
         FXMLLoader loader = new FXMLLoader (getClass ().getResource ("/vista/InactivarActivarOrganizacion.fxml"));
         //Carga la Ventana. 
         Parent root = loader.load ();
         
         //Creación del Scene. 
         Scene scene  = new Scene (root);
         Stage stage  = new Stage ();
         stage.initModality (Modality.APPLICATION_MODAL);
         stage.setScene(scene);
         stage.setResizable(false);
         stage.showAndWait();
        } catch (IOException ex){
            Logger.getLogger(GestionarOrganizaciónController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}

