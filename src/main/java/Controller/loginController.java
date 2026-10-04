package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {
    public Button btnreset;
    public Button btnlogin;
    public TextField txtusername;
    public TextField txtpassword;

    public void btnResetOnAction(ActionEvent actionEvent) {

    }

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String username = txtusername.getText();
        String password = txtpassword.getText();

        checkLoginCredintials(username,password);

    }

    private void checkLoginCredintials(String username, String password) {
        if(username.equals("admin1234") && password.equals("1234")){
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();


        }
    }
}
