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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class LoginController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button code;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void login(ActionEvent event) {
        if ("Tabia Morshed".equals(username.getText()) && "20200204027".equals(password.getText())) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Choose.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);

                ChooseController welcome = loader.getController();

                Stage stagePlay = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stagePlay.setScene(scene);
                stagePlay.setTitle("Log In");
                stagePlay.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Wrong Username or Password");
        }
    }

}
