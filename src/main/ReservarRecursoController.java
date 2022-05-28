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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Luis Angel Díaz
 */
public class ReservarRecursoController implements Initializable {

    @FXML
    private TextField BTNDescripcionActividad;
    @FXML
    private TextField BTNNombreActividad;
    @FXML
    private TextField BTNFechaReserva;
    @FXML
    private TextField BTNoraInicioReserva;
    @FXML
    private TextField BTNHoraFinReserva;
    @FXML
    private Button BTNGuardarReservaRecursos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void DescripcionActividad(ActionEvent event) {
    }

    @FXML
    private void NombreActividad(ActionEvent event) {
    }

    @FXML
    private void FechaReserva(ActionEvent event) {
    }

    @FXML
    private void HoradeInicioReserva(ActionEvent event) {
    }

    @FXML
    private void HoraFinReserva(ActionEvent event) {
    }

    @FXML
    private void GuardarReservaRecursos(ActionEvent event) {
    }
    
}
