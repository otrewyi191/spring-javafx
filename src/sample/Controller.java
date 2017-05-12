package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.dts.Dir;


@Component
public class Controller {
    @FXML
    private TextField topTextField;

    @Autowired
    private myBean bean;

    @Autowired
    private Dir dir;

    public void setTextField(MouseEvent mouseEvent) {
        topTextField.setText(bean.getText());
        dir.listDir();
    }
}
