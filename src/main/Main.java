/*
 * Acá se encuentra la estrucutura para que programa funcione.
 * Esta es la Clase Principal, en otras palabras el Main del Programa. 
 */
package main;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Luis Angel Díaz
 */

    public class Main extends Application{

    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Este código arranca la aplicación, o en otras palabras carga la ventana, siendo el iniciador. 
        try {
         FXMLLoader loader = new FXMLLoader ();
         loader.setLocation (Main.class.getResource("/vista/Interfaz.fxml"));
         Pane ventana = (Pane) loader.load ();
         Scene scene  = new Scene (ventana);
         
         stage.setResizable(false);
         stage.setScene (scene);
         stage.show();
        } catch (IOException e){
            System.out.println (e.getMessage());
        }
    }
}

