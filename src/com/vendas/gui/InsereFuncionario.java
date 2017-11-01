package com.vendas.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class InsereFuncionario extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("InsereFuncionario.fxml"));
        
        Scene cena = new Scene(root);
        
        primaryStage.setScene(cena);
        
        primaryStage.show();
        
    }

    
    
}
