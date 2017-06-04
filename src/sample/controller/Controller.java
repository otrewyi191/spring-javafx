package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.application.entity.Dir;
import sample.domain.service.DtsService;


@Component
public class Controller {
    @FXML
    private TextField topTextField;

    @FXML
    private TextField rightTextField;


    @Autowired
    private Dir dir;

    @Autowired
    private DtsService dtsService;

    public void setTextField(MouseEvent mouseEvent) {
    }

    public void addServer(MouseEvent mouseEvent) {
        dtsService.setDtsNum(String.valueOf(1234));
        rightTextField.setText("server added");
    }
}
