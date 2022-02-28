/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Alejandra Ospina y Pamela Mena
 */
public class SolutionSudokuController implements Initializable {

    @FXML
    private Label label1;
    @FXML
    private Label label32;
    @FXML
    private Label label31;
    @FXML
    private Label label30;
    @FXML
    private Label label29;
    @FXML
    private Label label28;
    @FXML
    private Label label27;
    @FXML
    private Label label26;
    @FXML
    private Label label25;
    @FXML
    private Label label24;
    @FXML
    private Label label23;
    @FXML
    private Label label22;
    @FXML
    private Label label21;
    @FXML
    private Label label20;
    @FXML
    private Label label19;
    @FXML
    private Label label18;
    @FXML
    private Label label17;
    @FXML
    private Label label16;
    @FXML
    private Label label15;
    @FXML
    private Label label14;
    @FXML
    private Label label13;
    @FXML
    private Label label12;
    @FXML
    private Label label11;
    @FXML
    private Label label10;
    @FXML
    private Label label9;
    @FXML
    private Label label8;
    @FXML
    private Label label7;
    @FXML
    private Label label6;
    @FXML
    private Label label5;
    @FXML
    private Label label4;
    @FXML
    private Label label3;
    @FXML
    private Label label2;
    @FXML
    private Label label45;
    @FXML
    private Label label44;
    @FXML
    private Label label43;
    @FXML
    private Label label42;
    @FXML
    private Label label41;
    @FXML
    private Label label40;
    @FXML
    private Label label39;
    @FXML
    private Label label38;
    @FXML
    private Label label37;
    @FXML
    private Label label36;
    @FXML
    private Label label35;
    @FXML
    private Label label34;
    @FXML
    private Label label33;
    @FXML
    private Label label81;
    @FXML
    private Label label80;
    @FXML
    private Label label79;
    @FXML
    private Label label78;
    @FXML
    private Label label77;
    @FXML
    private Label label76;
    @FXML
    private Label label75;
    @FXML
    private Label label74;
    @FXML
    private Label label73;
    @FXML
    private Label label72;
    @FXML
    private Label label71;
    @FXML
    private Label label70;
    @FXML
    private Label label69;
    @FXML
    private Label label68;
    @FXML
    private Label label67;
    @FXML
    private Label label66;
    @FXML
    private Label label65;
    @FXML
    private Label label64;
    @FXML
    private Label label63;
    @FXML
    private Label label62;
    @FXML
    private Label label61;
    @FXML
    private Label label60;
    @FXML
    private Label label59;
    @FXML
    private Label label58;
    @FXML
    private Label label57;
    @FXML
    private Label label56;
    @FXML
    private Label label55;
    @FXML
    private Label label54;
    @FXML
    private Label label53;
    @FXML
    private Label label52;
    @FXML
    private Label label51;
    @FXML
    private Label label50;
    @FXML
    private Label label49;
    @FXML
    private Label label48;
    @FXML
    private Label label47;
    @FXML
    private Label label46;
    @FXML
    private Label numberSol;
    @FXML
    private GridPane gridPane;
    
    private Label[][] labelGrid; //Matriz de labels
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {
        //Inicializacion de la matriz de labels
       labelGrid = new Label [9][9];
       labelGrid[0][0] = label1;
       labelGrid[0][1] = label2;
       labelGrid[0][2] = label3;
       labelGrid[0][3] = label4;
       labelGrid[0][4] = label5;
       labelGrid[0][5] = label6;
       labelGrid[0][6] = label7;
       labelGrid[0][7] = label8;
       labelGrid[0][8] = label9;
       labelGrid[1][0] = label10;
       labelGrid[1][1] = label11;
       labelGrid[1][2] = label12;
       labelGrid[1][3] = label13;
       labelGrid[1][4] = label14;
       labelGrid[1][5] = label15;
       labelGrid[1][6] = label16;
       labelGrid[1][7] = label17;
       labelGrid[1][8] = label18;
       labelGrid[2][0] = label19;
       labelGrid[2][1] = label20;
       labelGrid[2][2] = label21;
       labelGrid[2][3] = label22;
       labelGrid[2][4] = label23;
       labelGrid[2][5] = label24;
       labelGrid[2][6] = label25;
       labelGrid[2][7] = label26;
       labelGrid[2][8] = label27;
       labelGrid[3][0] = label28;
       labelGrid[3][1] = label29;
       labelGrid[3][2] = label30;
       labelGrid[3][3] = label31;
       labelGrid[3][4] = label32;
       labelGrid[3][5] = label33;
       labelGrid[3][6] = label34;
       labelGrid[3][7] = label35;
       labelGrid[3][8] = label36;
       labelGrid[4][0] = label37;
       labelGrid[4][1] = label38;
       labelGrid[4][2] = label39;
       labelGrid[4][3] = label40;
       labelGrid[4][4] = label41;
       labelGrid[4][5] = label42;
       labelGrid[4][6] = label43;
       labelGrid[4][7] = label44;
       labelGrid[4][8] = label45;
       labelGrid[5][0] = label46;
       labelGrid[5][1] = label47;
       labelGrid[5][2] = label48;
       labelGrid[5][3] = label49;
       labelGrid[5][4] = label50;
       labelGrid[5][5] = label51;
       labelGrid[5][6] = label52;
       labelGrid[5][7] = label53;
       labelGrid[5][8] = label54;
       labelGrid[6][0] = label55;
       labelGrid[6][1] = label56;
       labelGrid[6][2] = label57;
       labelGrid[6][3] = label58;
       labelGrid[6][4] = label59;
       labelGrid[6][5] = label60;
       labelGrid[6][6] = label61;
       labelGrid[6][7] = label62;
       labelGrid[6][8] = label63;
       labelGrid[7][0] = label64;
       labelGrid[7][1] = label65;
       labelGrid[7][2] = label66;
       labelGrid[7][3] = label67;
       labelGrid[7][4] = label68;
       labelGrid[7][5] = label69;
       labelGrid[7][6] = label70;
       labelGrid[7][7] = label71;
       labelGrid[7][8] = label72;
       labelGrid[8][0] = label73;
       labelGrid[8][1] = label74;
       labelGrid[8][2] = label75;
       labelGrid[8][3] = label76;
       labelGrid[8][4] = label77;
       labelGrid[8][5] = label78;
       labelGrid[8][6] = label79;
       labelGrid[8][7] = label80;
       labelGrid[8][8] = label81;
       
    }
    
    public void setSolution(String solution) //Funcion para poner la solucion en los labels 
    {
       String [] parts = solution.split("\n");
            for(int i=0; i<9; i++)
            {
                String[] parts2 = parts[i].split(" ");
                for(int j=0; j<9; j++)
                {
                    labelGrid[i][j].setText(parts2[j]);
                }

            } 
    }
    public void setNummberSol(int sol) //Funcion para poner el numero de solucion 
    {
        numberSol.setText(String.valueOf(sol));
    }
    
    public Label[][] getLabels() //Funcion para retornar los labels
    {
        return labelGrid;
    }
}
    


