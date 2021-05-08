package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    public TextField txtLicznik1;
    public TextField txtLicznik2;
    public TextField txtLicznik3;
    public TextField txtLicznik4;
    public TextField txtLicznik5;
    public TextField txtLicznik6;
    public TextField txtLicznik7;
    double a, b, c;
    int cenR = 3;
    int cenaNieR = 13;
    double cR = 0.7;
    double cNieR = 1.2;
    public void onBtnAction(ActionEvent actionEvent){
         a = 2 * 3.14 * (Integer.parseInt(txtLicznik1.getText()) + Integer.parseInt(txtLicznik2.getText()));
         b = 2 * 3.14 * (Integer.parseInt(txtLicznik1.getText()) - Integer.parseInt(txtLicznik3.getText()) +
                 Integer.parseInt(txtLicznik2.getText()));
         c = a - b;
         txtLicznik4.setText(c * cenR + "");
         txtLicznik6.setText(c * cenaNieR + "");
         txtLicznik5.setText(c * cR + "");
         txtLicznik7.setText(c * cNieR +"");


    }
}
