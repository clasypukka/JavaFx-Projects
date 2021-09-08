/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KIDS_CONTROLLER;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author philip Agbor
 */
public class MAIN_PAGEController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ABCD(ActionEvent event) throws IOException {
   
        
        Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/A.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));}

    @FXML
    private void vegetable(ActionEvent event) throws IOException
            
    {Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/verg1.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void animal(ActionEvent event) throws IOException {
        
         {Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/anim1.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));}
    }

    @FXML
    private void consonant(ActionEvent event) throws IOException {
        {Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/conB.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));}
    }

    @FXML
    private void IQ_test(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/QUA1.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void colors(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/col1.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void vowel(ActionEvent event) throws IOException {
        {Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/volA.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));}
    }

    }
    

