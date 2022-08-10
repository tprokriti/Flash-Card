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
public class TwooptionsplayController implements Initializable {

    @FXML
    private Button txt;
    @FXML
    private Button pic;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void text(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("playing.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            PlayingController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void picture(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("options.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            OptionsController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
