package sample;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.util.HashMap;




public class Controller {

    @FXML
    AnchorPane pane;

    @FXML
    private JFXTextField fxUsername;

    @FXML
    private JFXPasswordField fxPassword;

    @FXML
    private Label usernameWornning;

    @FXML
    private Label passwordWorning;


    HashMap<String, String> map;

    {
        map = new HashMap<>();
        map.put("omar", "123");
    }




    @FXML
    private void handleClose() {
        System.exit(0);
    }


    private void wrongPassword(){
        pane.setStyle("-fx-background-color: #ff0000");
    }


    private void formValidation(){
        if(!fxUsername.getText().isEmpty() && !fxPassword.getText().isEmpty()){
            String username = fxUsername.getText();
            String password = fxPassword.getText();
            if(map.containsKey(username) && password.equals(map.get(username))) {
                System.out.println("login is succeed ");
            }
            else if(!map.containsKey(username)) {
                usernameWornning.setText(" wrong username ");
                System.out.println("usename= " + fxUsername.getText() + " password= " + fxPassword.getText());
            }
            else{
                wrongPassword();
                passwordWorning.setText("wrong password");
            }
        }
    }

    @FXML
    private void handleLoginButton() {
        formValidation();
    }
}
