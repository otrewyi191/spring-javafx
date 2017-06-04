package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.domain.Dir;
import sample.entity.myBean;
import sample.hwm.AddServer;


@Component
public class Controller {
    @FXML
    private TextField topTextField;

    @FXML
    private TextField rightTextField;

    @Autowired
    private AddServer addServer;

    @Autowired
    private myBean bean;

    @Autowired
    private Dir dir;

    public void setTextField(MouseEvent mouseEvent) {
        topTextField.setText(bean.getText());
        dir.listDir();
    }

    public void addServer(MouseEvent mouseEvent) {
        rightTextField.setText("server added");
        addServer.add("1.2.3.4");
    }
}
