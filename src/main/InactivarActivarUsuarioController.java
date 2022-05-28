/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Luis Angel Díaz
 */
public class InactivarActivarUsuarioController implements Initializable {

    @FXML
    private CheckBox SelecionInactivo;
    @FXML
    private CheckBox SelecionActivo;
    @FXML
    private TextField BTNActivoInactivoUsuarioAdminoSistema;
    @FXML
    private TextField BTNInactivoActivoNombreUsuario;
    @FXML
    private TextField BTNInactivoActivoCodigoUsuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EstadoOrg(ActionEvent event) {
    }

    @FXML
    private void UsuarioAdminoSistema(ActionEvent event) {
    }

    @FXML
    private void NombreUsuarioActivoInactivo(ActionEvent event) {
    }

    @FXML
    private void CodigoUsuarioActivoInactivo(ActionEvent event) {
    }
    
}
