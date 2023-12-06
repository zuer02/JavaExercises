import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
//import model.AlunoModel;
//import model.Banco;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.application.Application;

public class App extends Application {

    static Connection con;

    public void start(Stage primaryStage) throws Exception{
       
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("./view/telaLogin.fxml"));

        Parent root = loader.load();

        Scene cena = new Scene(root, 520,250);
        primaryStage.setTitle("PPGmcs");
        primaryStage.setScene(cena);
        primaryStage.show();

    }


    public static void main(String[] args) throws SQLException {
        launch(args);

        //Banco BD = Banco.getInstancia();
        

        
        //insert(1, "joao", "boanerges", 2000, 22);
        //insert(2, "tiago", "boanerges", 2000, 22);
        //insert(3, "joana", "amorim araujo", 2010, 12);
            
    }
}

