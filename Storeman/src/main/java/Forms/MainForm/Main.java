package Forms.MainForm;

import Model.Entities.ProductType;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        primaryStage.setTitle("Storeman");
        Scene scene = new Scene(root, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        ProductType type = new ProductType();
        type.setName("sdf");
        type.setMeasureUnits("sdf");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
