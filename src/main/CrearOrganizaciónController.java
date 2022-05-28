 /*
 * Acá se estructura el código referente a la Creación de la organización, 
 * Modificación e Inactivación/Activación de la misma. 
 */
package main;

import clases.Organizaciones;
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
public class CrearOrganizaciónController implements Initializable {

    @FXML
    private TextField BTNNombreOrg;
    @FXML
    private TextField BTNCodigoOrg;
    @FXML
    private TextField BTNDireccion;
    @FXML
    private TextField BTNNumeroTel;
    @FXML
    private TextField BTNCorreoElect;
    @FXML
    private Button BTNCrearOrganizacion;
    @FXML
    private Button BTNCrearAsignar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void crearorganizacion(ActionEvent event) {
    
        String Código_Organización = this.BTNCodigoOrg.getText();
        String Nombre_Organización = this.BTNNombreOrg.getText(); 
        String Dirección = this.BTNDireccion.getText();
        String Número_Teléfono = this.BTNNumeroTel.getText();
        String Correo_Electrónico = this.BTNCorreoElect.getText();
        
        Organizaciones org = new Organizaciones (Código_Organización, Nombre_Organización, Dirección, Número_Teléfono, Correo_Electrónico);  
    }

    @FXML
    private void CREARASIGNAR(ActionEvent event) {
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
}

