
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextDemo extends Application {

	@Override
	public void start(Stage stage) {
		Group root = new Group(); //make the root of the scene graph
		Scene scene = new Scene(root, 500, 500, Color.CADETBLUE);
		//set up the scene to point to the root, with an optional background color
		stage.setTitle("JavaFX Shape Demo");

		//Make Nodes to add to the scene graph

		makeText(root);

		stage.setScene(scene);
		stage.show();
	}

	private void makeText(Group root){
		Text t1 = new Text(20,20, "Plain text");
		Text t2 = new Text(20,50, "bigger text");
		t2.setFont(new Font(40));

		Text t3 = new Text(20,100, "bold consolas text");
		t3.setFont(Font.font("Consolas", FontWeight.BLACK, 20));
		t3.setFill(Color.BLUEVIOLET);
		Text text = new Text(20, 200, "Here's some Fancy Text");
		text.setFont(Font.font("Verdana", FontWeight.BOLD, 
						FontPosture.ITALIC, 30));
		text.setFill(Color.LIGHTSALMON);
		text.setStroke(Color.DARKBLUE);
		text.setStrokeWidth(2);
		text.setUnderline(true);
		root.getChildren().addAll(t1, t2, t3,  text);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
