package dad.javafx.buscaryreemplazar;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazarApp extends Application {

	TextField buscar;
	TextField remplazar;
	
	CheckBox mayus,lookingfor,regularexp,resaltar;
	
	Button buscarButton, reemplazarButton,reemplazartodoButton,cerrarButton,ayudaButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscar = new TextField();
		remplazar = new TextField();
		
		buscarButton = new Button("Buscar");
		buscarButton.setAlignment(Pos.CENTER);
		buscarButton.setMaxWidth(150);
		
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setAlignment(Pos.CENTER);
		reemplazarButton.setMaxWidth(150);
		
		reemplazartodoButton = new Button("Reemplazar todo");
		reemplazartodoButton.setAlignment(Pos.CENTER);
		reemplazartodoButton.setMaxWidth(150);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setAlignment(Pos.CENTER);
		cerrarButton.setMaxWidth(150);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setAlignment(Pos.CENTER);
		ayudaButton.setMaxWidth(150);
		
		mayus = new CheckBox("Mayusculas y minúsculas");
		lookingfor = new CheckBox("Buscar hacia atrás");
		regularexp = new CheckBox("Expresión regular");
		resaltar = new CheckBox("Resaltar resultados");
		
		GridPane panel1 = new GridPane();
		//panel1.setStyle("-fx-background-color: green;");
		panel1.setPadding(new Insets(5));
		panel1.setAlignment(Pos.TOP_RIGHT);
		panel1.setHgap(5);
		panel1.setVgap(5);
		//panel1.setGridLinesVisible(true);
		
		panel1.addRow(0, new Label("Buscar:"),buscar);
		panel1.addRow(1, new Label("Remplazar con:"),remplazar);
		
		panel1.add(mayus, 1, 2);
		panel1.add(lookingfor, 2, 2);
		panel1.add(regularexp, 1, 3);
		panel1.add(resaltar, 2, 3);
		
		panel1.setColumnSpan(buscar,3);
		panel1.setColumnSpan(remplazar, 3);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
		cols[0].setHalignment(HPos.LEFT);
		cols[1].setHgrow(Priority.ALWAYS);
		cols[2].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		panel1.getColumnConstraints().setAll(cols);
		
		VBox panel2 = new VBox(
				buscarButton,
				reemplazarButton,
				reemplazartodoButton,
				cerrarButton,
				ayudaButton
				);
		
		panel2.setAlignment(Pos.TOP_LEFT);
		panel2.setSpacing(5);
		panel2.setPadding(new Insets(5));
		//panel2.setStyle("-fx-background-color: orange;");
		
		BorderPane root= new BorderPane();
		root.setCenter(panel1);
		root.setRight(panel2);
		
		Scene scene = new Scene(root,640,480);
		
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
