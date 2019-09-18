package sample;

import java.net.URL;
import java.security.AllPermission;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Controller {
    int i, j = 1;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addInsideBtn;

    @FXML
    private Button addOutsideBtn;

    @FXML
    private Button ClearBtn;

    @FXML
    private AnchorPane root;

    @FXML
    public void addInsTriangle(ActionEvent event){
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                200.0, 50.0 + i*2,
                100.0 + i*2, 300.0 - i*2,
                300.0 - i*2, 300.0 - i*2
        });
        triangle.setFill(Color.BLUEVIOLET);
        triangle.setStroke(Color.BLACK);
        root.getChildren().add(triangle);
        i++;
    }
    public void addOutTriangle(ActionEvent event){
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                200.0, 50.0 - j*2,
                100.0 - j*2, 300.0 + j*2,
                300.0 + j*2, 300.0 + j*2
        });
        triangle.setFill(Color.TRANSPARENT);
        triangle.setStroke(Color.BLACK);
        root.getChildren().add(triangle);
        j++;
    }
    @FXML
    public void clearShape(ActionEvent event){
    }

    @FXML
    void initialize() {
        addInsideBtn.defaultButtonProperty().bind(addInsideBtn.focusedProperty());
        addOutsideBtn.defaultButtonProperty().bind(addOutsideBtn.focusedProperty());
        ClearBtn.defaultButtonProperty().bind(ClearBtn.focusedProperty());
    }
}
