package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.domain.entity.Dir;


@Component
public class Controller {
    @FXML
    private TextField topTextField;

    @FXML
    private TextField rightTextField;


    @Autowired
    private Dir dir;

    public void setTextField(MouseEvent mouseEvent) {
        dir.listDir();
    }

    public void addServer(MouseEvent mouseEvent) {
        rightTextField.setText("server added");
    }
}
