/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author pc doctor
 */
public class MyViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    CheckBox check;
    @FXML
    private Button btn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        check.setText("hello");
        check.setOnAction((event) -> {
            System.out.println("clicked");
        });
        // TODO
    }    

    @FXML
    private void sayHello(ActionEvent event) {
    }
    
}
