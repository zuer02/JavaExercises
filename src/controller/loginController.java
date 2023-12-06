package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField senhaText;

    @FXML
    private TextField usuarioText;

    @FXML
    void loginClicado(ActionEvent event) throws Exception {
        String usuario = usuarioText.getText();
        String senha = senhaText.getText();
        if(usuario.equals("rene") && senha.equals("123")){
            Stage secondStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/telaBoasVindas.fxml"));
            Parent root = loader.load();
            
            boasVindasController cBoasVindas = loader.getController();
            cBoasVindas.setNomeUsuario(usuario);

            Scene cenario = new Scene(root, 600, 404);

            secondStage.setTitle("Bem vindo");
            secondStage.setScene(cenario);
            secondStage.show();
        }
    }

}
