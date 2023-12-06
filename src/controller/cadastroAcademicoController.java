package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.AlunoModel;

public class cadastroAcademicoController {

    @FXML
    private TextField anonascimentoAcademico;

    @FXML
    private TextField emailAcademico;

    @FXML
    private TextField idadeAcademico;

    @FXML
    private TextField matriculaAcademico;

    @FXML
    private TextField nomeAcademico;

    @FXML
    private Button salvarCadastroAcademico;

    @FXML
    private TextField sobrenomeAcademico;

    @FXML
    private TextField telefoneAcademico;

    @FXML
    private Label textoCadastrado;


    @FXML
    void salvarClicado(ActionEvent event) throws Exception {
        String ano = anonascimentoAcademico.getText(); // O getText só retorna String, fui obrigado a colocar string em todos
        String email = emailAcademico.getText();
        String idade = idadeAcademico.getText();
        String matricula = matriculaAcademico.getText();
        String nome = nomeAcademico.getText();
        String sobrenome = sobrenomeAcademico.getText();
        String telefone = telefoneAcademico.getText();
        AlunoModel aux = new AlunoModel(nome, sobrenome, email, telefone, Integer.parseInt(ano), Integer.parseInt(idade), matricula);
        aux.insert(nome, sobrenome, email, telefone, Integer.parseInt(ano), Integer.parseInt(idade), matricula);

        

        Stage thirdStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            textoCadastrado.setVisible(true);
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/telaLogin.fxml"));
            Parent root = loader.load();

            Scene cenario = new Scene(root, 520, 250);

            thirdStage.setTitle("CONCLUA");
            thirdStage.setScene(cenario);
            thirdStage.show();
    }

    }

