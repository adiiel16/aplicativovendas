package com.vendas.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;


public class PainelDeControleController implements Initializable {

    @FXML
    private Button btninsfunc;
    @FXML
    
    private Button btninsereproduto;

    @FXML
    void inserefuncionario(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("InsereFuncionario.fxml"));
        
        PainelControle painelControle = new PainelControle();
        
        InsereFuncionario insereFuncionario = new InsereFuncionario();
    }

    @FXML
    void insereproduto(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
