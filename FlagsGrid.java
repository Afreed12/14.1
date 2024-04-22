import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FlagsGrid extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Flags Grid");

        GridPane grid = new GridPane();

        Image germanFlag = new Image("");
        Image chinaFlag = new Image("");
        Image franceFlag = new Image("");
        Image usFlag = new Image("");

        ImageView germanImageView = new ImageView(germanFlag);
        ImageView chinaImageView = new ImageView(chinaFlag);
        ImageView franceImageView = new ImageView(franceFlag);
        ImageView usImageView = new ImageView(usFlag);

        germanImageView.setFitWidth(200);
        germanImageView.setFitHeight(100);
        chinaImageView.setFitWidth(200);
        chinaImageView.setFitHeight(100);
        franceImageView.setFitWidth(200);
        franceImageView.setFitHeight(100);
        usImageView.setFitWidth(200);
        usImageView.setFitHeight(100);

        grid.add(germanImageView, 0, 0);
        grid.add(chinaImageView, 1, 0);
        grid.add(franceImageView, 0, 1);
        grid.add(usImageView, 1, 1);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
