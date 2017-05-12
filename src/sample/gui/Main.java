package sample.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import sample.config.Config;

@PropertySource(value = "classpath:properties/config.properties")
public class Main extends Application {

    private ApplicationContext applicationContext;
    private Parent parent;

    @Override
    public void start(Stage primaryStage) throws Exception{
        applicationContext = new AnnotationConfigApplicationContext(Config.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../sample.fxml"));

        fxmlLoader.setControllerFactory(applicationContext::getBean);

        parent = fxmlLoader.load();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
