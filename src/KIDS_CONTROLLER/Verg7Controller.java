/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KIDS_CONTROLLER;

import animatefx.animation.Tada;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author philip Agbor
 */
public class Verg7Controller implements Initializable {

    @FXML
    private AnchorPane pane;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       pane.setVisible(true);
        new Tada(pane).play();
    }

    @FXML
    private void NEXT_verg8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/verg8.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void BACK_verg6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/verg6.fxml"));
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
          String musicFile = "C:\\Users\\philip Agbor\\Documents\\Sound recordings\\Recording (59).M4A";
        Media music = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaplayer = new MediaPlayer(music);
        mediaplayer.play();
    }
    
}
