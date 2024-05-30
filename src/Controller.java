import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Label LabelBtn;

    @FXML
    private void clickButton1(ActionEvent eventOne) {LabelBtn.setText("Clicked BTN1");}

    @FXML
    private void clickButton2(ActionEvent eventTwo) {LabelBtn.setText("Clicked BTN2");}

    @FXML
    private void clickButton3(ActionEvent eventThree) {LabelBtn.setText("Clicked BTN3");}
}
