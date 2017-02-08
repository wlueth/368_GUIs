
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

public class ShapeDemo extends Application {

	 @Override
	   public void start(Stage stage) {
	       Group root = new Group(); //make the root of the scene graph
	       Scene scene = new Scene(root, 300, 300, Color.CADETBLUE);
	       		//set up the scene to point to the root, with an optional background color
	       stage.setTitle("JavaFX Shape Demo");
	       
	       //Make Nodes to add 
	       Text t = new Text(20, 20, "Kendra's Shape Demo"); t.setFont(new Font(20));
	      Circle c = new Circle(100, 100, 50, Color.YELLOW);
	      Rectangle eye1 = new Rectangle(70, 80, 15, 15); eye1.setFill(Color.BLUE);
	      Rectangle eye2 = new  Rectangle(120, 80, 15, 15); eye2.setFill(Color.BLUE);
	      Polyline nose = new Polyline();
	      nose.getPoints().addAll(new Double[]{ 95.0, 95.0, 110.0, 110.0, 100.0, 80.0});
	   

	      Ellipse mouth = new Ellipse(100, 130, 15, 10); mouth.setFill(Color.RED);
	       //Add Nodes to the scene graph
	       root.getChildren().addAll(t, c, eye1, eye2, nose, mouth);
	       
	       stage.setScene(scene);
	       stage.show();
	   }
	 public static void main(String[] args) {
	       launch(args);
	   }
}