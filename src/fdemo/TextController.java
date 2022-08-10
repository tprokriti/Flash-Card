/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TextController implements Initializable {
    @FXML
    private AnchorPane scenePane;
@FXML

    private void homeaction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Choose.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage stageHome = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageHome.setScene(scene);
            stageHome.setTitle("Memory Cartridge");
            stageHome.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exitAction(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("!!!EXITTING!!!");
        alert.setContentText("Want to Exit ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }

    }

    @FXML
    private Button nxt;
    @FXML
    
    private Button sv;
private int counter=0;
Stage stage;
FileChooser saveFIleChooser = new FileChooser();
@FXML
    private TextField questionField;
    @FXML
    private TextField answerField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nnext(ActionEvent event) throws IOException {
        System.out.println("Next Action!");
        counter++;
        FileWriter file = new FileWriter("temp.txt", true);
        BufferedWriter b = new BufferedWriter(file);
        b.write(questionField.getText());
        b.newLine();
        b.write(answerField.getText());
        b.newLine();
        b.close();
        file.close();
        questionField.setText("");
        answerField.setText("");
        System.out.println(counter);

    }

    @FXML
    private void save(ActionEvent event) throws IOException {
        saveFIleChooser.setTitle("Saving option");
        File file = saveFIleChooser.showSaveDialog(stage);
        if (file != null) {
            saveSystem(file);
        }
    }
    public void saveSystem(File file) throws IOException {
        System.out.println("Save Action working");
        counter++;
        FileWriter file2 = new FileWriter("temp.txt", true);
        BufferedWriter b = new BufferedWriter(file2);
        b.write(questionField.getText());
        b.newLine();
        b.write(answerField.getText());
        b.newLine();
        b.close();
        file2.close();
        questionField.setText("");
        answerField.setText("");
        System.out.println(counter);

        FileInputStream r = new FileInputStream("temp.txt");
        FileOutputStream w = new FileOutputStream(file);

        int i;
        while ((i = r.read()) != -1) {
            w.write((char) i);
        }
        System.out.println("Saved Successfully");

        r.close();
        w.close();

        PrintWriter writer = new PrintWriter("temp.txt");
        writer.print("");
        writer.close();

    }

    
}
