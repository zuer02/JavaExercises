package controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class boasVindasController {

    @FXML
    private Button botaoCadastroAcademico;

    @FXML
    void botaoCadastroAcademicoClicado(ActionEvent event) throws Exception {
        Stage fifthStage = (Stage)((Node) event.getSource()).getScene().getWindow();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/telaCadastroAcademico.fxml"));
        Parent root = loader.load();

        Scene cenario = new Scene(root, 600, 404);

        fifthStage.setScene(cenario);
        fifthStage.show();
        }

    @FXML
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario.setText(nomeUsuario);
    }

    @FXML
    private TextField nomeUsuario;

    @FXML
    private Button sairBotao;

    @FXML
    void sairAcao(ActionEvent event) throws IOException {
        Stage fourthStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/telaLogin.fxml"));
            Parent root = loader.load();
            
            Scene cenario = new Scene(root, 520, 250);

            fourthStage.setTitle("CONCLUA");
            fourthStage.setScene(cenario);
            fourthStage.show();

    }

}
