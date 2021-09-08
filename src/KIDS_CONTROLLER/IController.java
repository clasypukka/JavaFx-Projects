/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KIDS_CONTROLLER;

import animatefx.animation.Bounce;
import animatefx.animation.FadeInDown;
import animatefx.animation.FadeOut;
import animatefx.animation.Hinge;
import animatefx.animation.RotateIn;
import animatefx.animation.Shake;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author philip Agbor
 */
public class IController implements Initializable {

    @FXML
    private AnchorPane pane;
    
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pane.setVisible(true);
        new Bounce(pane).play();
    }    
    

    @FXML
    private void next_j(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/J.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void BACK_h(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/H.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void NEXT_MAIN(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/MAIN_PAGE.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void speak(ActionEvent event) {
        String musicFile = "C:\\Users\\CLASYPUKKA\\Desktop\\projects\\KIDS_APP\\src\\AUDIO\\ICECREAM.mp3";
        Media music = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaplayer = new MediaPlayer(music);
        mediaplayer.play();
    }
}
