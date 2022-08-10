/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button nextbutton;

    /**
     * Initializes the controller class.
     */
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void next(ActionEvent event) {
        System.out.println("Going Next");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            LoginController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Log In");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
