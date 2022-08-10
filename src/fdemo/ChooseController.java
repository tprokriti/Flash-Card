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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ChooseController implements Initializable {

    @FXML
    private AnchorPane scenePane;
    @FXML
    private Button cfc;
    @FXML
    private Button pfc;
    @FXML
    private Button exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createf(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("twooptions.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            TwooptionsController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void playf(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("twooptionsplay.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            TwooptionsplayController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exitf(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Leave");
        alert.setHeaderText("You are going to exit!");
        alert.setContentText("Do you want to exit ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage=(Stage)scenePane.getScene().getWindow();
            stage.close();
        }
    }
    
}
