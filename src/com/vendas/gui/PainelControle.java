package com.vendas.gui;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    
    class PainelControle extends Application {
        
        @Override
        public void start(Stage primaryStage) throws IOException {
        
            Parent root = FXMLLoader.load(getClass().getResource("Painel de Controle.fxml"));
                    
            Scene cena = new Scene(root);
            
            primaryStage.setScene(cena);
            primaryStage.show();
            
        }
         
    }
    

