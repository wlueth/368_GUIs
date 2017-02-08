
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

public class LineDemo extends Application {

	@Override
	public void start(Stage stage) {
		Group root = new Group(); //make the root of the scene graph
		Scene scene = new Scene(root, 500, 500, Color.CADETBLUE);
		//set up the scene to point to the root, with an optional background color
		stage.setTitle("JavaFX Shape Demo");

		//Make Nodes to add to the scene graph
		makeLines(root);
		makeDashedLines(root);
		stage.setScene(scene);
		stage.show();
	}
	private void makeLines(Group root) {
		Text text = new Text(20,20,"These are colored lines:");
		text.setFont(Font.font("Times", FontWeight.BOLD, 20));
		text.setFill(Color.BLUEVIOLET);
		
		Line line1 = new Line(20, 30, 400, 30); //straight line
		line1.setStroke(Color.GREEN);
		line1.setStrokeWidth(10);

	
		
		Line line2 = new Line(20, 50, 400, 80); //diagonal line
		line2.setStroke(Color.BLUE);
		line2.setStrokeWidth(15);
		line2.setStrokeLineCap(StrokeLineCap.SQUARE); //round the edges

		Line line3 = new Line(20, 90, 400, 90);
		line3.setStroke(Color.RED);
		line3.getStrokeDashArray().addAll(40d, 20d); //segment-gap pattern
		//StrokeDashArray defines the pattern of line and gap sequences. 
		line3.setStrokeWidth(5);
	

		//Add Nodes to scene graph
		root.getChildren().addAll(text, line1, line2, line3);

	}
	
	private void makeDashedLines(Group root){
		Text text = new Text(20,120,"These are dashed lines:");
		text.setFont(new Font(20));
		
		Line line1 = new Line(20, 140, 400, 140); //straight line
		line1.getStrokeDashArray().addAll(25.0, 20.0, 5.0, 20d); //varied dash

		Line line2 = new Line(20, 160, 400, 160);
		line2.getStrokeDashArray().addAll(50d, 40d);

		Line line3 = new Line(20, 180, 400, 180);
		line3.getStrokeDashArray().addAll(25d, 10d);

		Line line4 = new Line(20, 200, 400, 200);
		line4.getStrokeDashArray().addAll(2d);

		Line line5 = new Line(20, 220, 400, 220);
		line5.getStrokeDashArray().addAll(2d, 21d);
		root.getChildren().addAll(text, line1, line2, line3, line4, line5);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
