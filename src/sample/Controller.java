package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Controller {
    @FXML
    private TextField top123;

    @Autowired
    private myBean bean;

    public void setTextField(MouseEvent mouseEvent) {
        top123.setText("test");
        System.out.println(bean.getText());
    }
}
