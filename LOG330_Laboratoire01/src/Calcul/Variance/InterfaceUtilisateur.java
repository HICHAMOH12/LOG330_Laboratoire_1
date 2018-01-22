package Calcul.Variance;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InterfaceUtilisateur extends Application {
	
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
        primaryStage.setTitle("Calcule De La Varaince");
        
        BorderPane borderPaneRoot = new BorderPane();
        Scene scene = new Scene(borderPaneRoot, 800 , 600);
        primaryStage.setScene(scene);
        
        HBox hBox1 = new HBox();
        hBox1.setPadding(new Insets(20));
        hBox1.setSpacing(10);
        Label label1 = new Label("Chercher Fichier de Données");
        label1.setTextFill(Color.RED);
        
        
        Button buttonchercher = new Button("chercher CSV");
        hBox1.getChildren().addAll(label1,buttonchercher);
        
       
        
        VBox vBox1 = new VBox();
        vBox1.setPadding(new Insets(30));
        vBox1.setSpacing(20);
        
        Label labe2 = new Label("calcul variance ");
        Label labe3 = new Label();
        Label labe4 = new Label("calcul Moyenne ");
        Label labe5 = new Label();
        Label labe6 = new Label("calcul Ecart Type ");
        Label labe7 = new Label();
        
        vBox1.getChildren().addAll(labe2,labe3,labe4,labe5,labe6,labe7);
        
        
        borderPaneRoot.setTop(hBox1);
        borderPaneRoot.setCenter(vBox1);
        
		primaryStage.show();

		
	}
      
}
