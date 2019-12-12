package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Controller {
    public ColorPicker colorpicker;
    public TextField textfield;


    int i, j = 1;
    @FXML
    private Button addInsideBtn;

    @FXML
    private Button addOutsideBtn;

    @FXML
    private Button ClearBtn;

    @FXML
    private AnchorPane root;


    public void addInsTriangle(ActionEvent event){
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(new Double[]{
                200.0, 50.0 + i*2,
                100.0 + i*2, 300.0 - i*2,
                300.0 - i*2, 300.0 - i*2
        });
        triangle.setFill(Color.valueOf(colorpicker.getValue().toString()));
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
        triangle.setFill(Color.valueOf(colorpicker.getValue().toString()));
        triangle.setStroke(Color.BLACK);
        root.getChildren().add(triangle);
        j++;
    }
    @FXML
    public void clearShape(ActionEvent event){
        root.getChildren().add(new AnchorPane());
    }

    @FXML
    void initialize() {
        addInsideBtn.defaultButtonProperty().bind(addInsideBtn.focusedProperty());
        addOutsideBtn.defaultButtonProperty().bind(addOutsideBtn.focusedProperty());
        ClearBtn.defaultButtonProperty().bind(ClearBtn.focusedProperty());

    }
}
