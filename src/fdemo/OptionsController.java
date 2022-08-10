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
public class OptionsController implements Initializable {

    @FXML
    private Button veg;
    @FXML
    private Button occu;
    @FXML
    private Button ani;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void vegetable(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("carrot.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            CarrotController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void occupation(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("engineer.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            EngineerController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void animals(ActionEvent event) {
        System.out.println("Play card Action");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("cat.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            CatController welcome = loader.getController();

            Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stagePlay.setScene(scene);
            stagePlay.setTitle("Play Flash Card");
            stagePlay.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
