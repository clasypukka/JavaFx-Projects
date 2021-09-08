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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author philip Agbor
 */
public class QUA1Controller implements Initializable {

    @FXML
    private Pane QUA1;
    @FXML
    private Pane QUA2;
    @FXML
    private Pane QUA3;
    @FXML
    private Pane QUA4;
    @FXML
    private Pane QUA5;
    @FXML
    private Pane QUA6;
    @FXML
    private Pane QUA7;
    @FXML
    private Pane QUA8;
    @FXML
    private Pane QUA9;
    @FXML
    private Pane QUA10;
    @FXML
    private RadioButton Q1A;
    @FXML
    private ToggleGroup Q1;
    @FXML
    private RadioButton Q1B;
    @FXML
    private RadioButton Q1C;
    @FXML
    private RadioButton Q2A;
    @FXML
    private ToggleGroup Q2;
    @FXML
    private RadioButton Q2B;
    @FXML
    private RadioButton Q2C;
    @FXML
    private RadioButton Q3A;
    @FXML
    private ToggleGroup Q3;
    @FXML
    private RadioButton Q3B;
    @FXML
    private RadioButton Q3C;
    @FXML
    private RadioButton Q4A;
    @FXML
    private ToggleGroup Q4;
    @FXML
    private RadioButton Q4B;
    @FXML
    private RadioButton Q4C;
    @FXML
    private RadioButton Q5A;
    @FXML
    private ToggleGroup Q5;
    @FXML
    private RadioButton Q5B;
    @FXML
    private RadioButton Q5C;
    @FXML
    private RadioButton Q6A;
    @FXML
    private ToggleGroup Q6;
    @FXML
    private RadioButton Q6B;
    @FXML
    private RadioButton Q6C;
    @FXML
    private RadioButton Q7A;
    @FXML
    private ToggleGroup Q7;
    @FXML
    private RadioButton Q7B;
    @FXML
    private RadioButton Q7C;
    @FXML
    private RadioButton Q8A;
    @FXML
    private ToggleGroup Q8;
    @FXML
    private RadioButton Q8B;
    @FXML
    private RadioButton Q8C;
    @FXML
    private RadioButton Q9A;
    @FXML
    private ToggleGroup Q9;
    @FXML
    private RadioButton Q9B;
    @FXML
    private RadioButton Q9C;
    @FXML
    private RadioButton Q10A;
    @FXML
    private ToggleGroup Q10;
    @FXML
    private RadioButton Q10B;
    @FXML
    private RadioButton Q10C;
    @FXML
    private Pane ANS;
    @FXML
    private Label LABEL1;
    @FXML
    private Label LABEL10;
    @FXML
    private Label LABEL2;
    @FXML
    private Label LABEL3;
    @FXML
    private Label LABEL4;
    @FXML
    private Label LABEL5;
    @FXML
    private Label LABEL6;
    @FXML
    private Label LABEL7;
    @FXML
    private Label LABEL8;
    @FXML
    private Label LABEL9;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void NEXT_QUA2(ActionEvent event) {
         QUA1.setVisible(false);
        QUA2.setVisible(true);
    }

   

    @FXML
    private void NEXT_Q3(ActionEvent event) {
        QUA2.setVisible(false);
        QUA3.setVisible(true);
    }

    @FXML
    private void BACK_Q1(ActionEvent event) {
        QUA1.setVisible(true);
        QUA2.setVisible(false);
    }

    @FXML
    private void NEXT_Q4(ActionEvent event) {
         QUA3.setVisible(false);
        QUA4.setVisible(true);
    }

    @FXML
    private void BACK_Q2(ActionEvent event) {
         QUA2.setVisible(true);
        QUA3.setVisible(false);
    }

    @FXML
    private void NEXT_Q5(ActionEvent event) {
         QUA4.setVisible(false);
        QUA5.setVisible(true);
    }

    @FXML
    private void BACK_Q3(ActionEvent event) {
         QUA3.setVisible(true);
        QUA4.setVisible(false);
    }

    @FXML
    private void NEXT_Q6(ActionEvent event) {
         QUA5.setVisible(false);
        QUA6.setVisible(true);
    }

    @FXML
    private void BACK_Q4(ActionEvent event) {
         QUA4.setVisible(true);
        QUA5.setVisible(false);
    }

    @FXML
    private void NEXT_Q7(ActionEvent event) {
         QUA6.setVisible(false);
        QUA7.setVisible(true);
    }

    @FXML
    private void BACK_Q5(ActionEvent event) {
         QUA5.setVisible(true);
        QUA6.setVisible(false);
    }

    @FXML
    private void NEXT_Q8(ActionEvent event) {
         QUA7.setVisible(false);
        QUA8.setVisible(true);
    }

    @FXML
    private void BACK_Q6(ActionEvent event) {
         QUA6.setVisible(true);
        QUA7.setVisible(false);
    }

    @FXML
    private void NEXT_Q9(ActionEvent event) {
         QUA8.setVisible(false);
        QUA9.setVisible(true);
    }

    @FXML
    private void BACK_Q7(ActionEvent event) {
         QUA7.setVisible(true);
        QUA8.setVisible(false);
    }

    @FXML
    private void NEXT_Q10(ActionEvent event) {
         QUA9.setVisible(false);
        QUA10.setVisible(true);
    }

    @FXML
    private void BACK_Q8(ActionEvent event) {
         QUA8.setVisible(true);
        QUA9.setVisible(false);
    }

    @FXML
    private void NEXT_ANS(ActionEvent event) throws IOException {
       QUA10.setVisible(false);
       ANS.setVisible(true);
       
        if (this.Q1.getSelectedToggle().equals(Q1B)) {
            LABEL1.setText("Correct");
           
        } else {
            
            LABEL1.setText("Wrong");
        }
        
         
        if (this.Q2.getSelectedToggle().equals(Q2A)) {
            LABEL2.setText("Correct");
           
        } else {
            
            LABEL2.setText("Wrong");
        }
        if (this.Q3.getSelectedToggle().equals(Q3B)) {
            LABEL3.setText("Correct");
           
        } else {
            
            LABEL3.setText("Wrong");
        }
        if (this.Q4.getSelectedToggle().equals(Q4C)) {
            LABEL4.setText("Correct");
           
        } else {
            
            LABEL4.setText("Wrong");
        }
        if (this.Q5.getSelectedToggle().equals(Q5C)) {
            LABEL5.setText("Correct");
           
        } else {
            
            LABEL5.setText("Wrong");
        }
        if (this.Q6.getSelectedToggle().equals(Q6B)) {
            LABEL6.setText("Correct");
           
        } else {
            
            LABEL6.setText("Wrong");
        }
        if (this.Q7.getSelectedToggle().equals(Q7A)) {
            LABEL7.setText("Correct");
           
        } else {
            
            LABEL7.setText("Wrong");
        }
        if (this.Q8.getSelectedToggle().equals(Q8C)) {
            LABEL8.setText("Correct");
           
        } else {
            
            LABEL8.setText("Wrong");
        }
        if (this.Q9.getSelectedToggle().equals(Q9C)) {
            LABEL9.setText("Correct");
           
        } else {
            
            LABEL9.setText("Wrong");
        }
        if (this.Q10.getSelectedToggle().equals(Q10A)) {
            LABEL10.setText("Correct");
           
        } else {
            
            LABEL10.setText("Wrong");
        }
    }

    @FXML
    private void BACK_Q9(ActionEvent event) {
         QUA9.setVisible(true);
        QUA10.setVisible(false);
    }

    @FXML
    private void BACK_MAIN(ActionEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("/KIDS_VIEWS/MAIN_PAGE.fxml"));
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    
   
       
        
        
    
    
}
