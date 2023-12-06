package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class AlunoModel {
    
    static Connection con;
    private String nome;
    private String sobrenome;
    private String matricula;
    private String email;
    private String telefone;
    private Integer idade;
    private Integer ano_nascimento;

    public AlunoModel(String nome, String sobrenome, String email, String telefone, Integer idade, Integer ano_nascimento, String matricula){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.ano_nascimento = ano_nascimento;
    }

    public void insert(String nome, String sobrenome, String email, String telefone, Integer idade, Integer ano_nascimento, String matricula) throws SQLException {
        String query = "insert into alunos (nome, sobrenome, email, telefone, ano_nascimento, idade, matricula) values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, nome);
        st.setString(2, sobrenome);
        st.setString(3, email);
        st.setString(4, telefone);
        st.setInt(5, ano_nascimento);
        st.setInt(6, idade);
        st.setString(7, matricula);
        st.executeQuery();
        st.close();
    }

    public boolean create_or_update() throws ClassNotFoundException {
        Connection conn;
        int id = -1;

        try {
            conn = Banco.getInstancia().getConnection();
        } catch (SQLException e) {
            System.out.println("Erro ao tentar obter instancia da conexao com o banco");
            e.printStackTrace();
            return false;
        }

        try {
            String strQuery = "select * from alunos where nome = ? and sobrenome = ? and idade = ? and email = ? and telefone = ? and ano_nascimento = ? and matricula = ?";
            PreparedStatement query = conn.prepareStatement(strQuery);
            query.setString(1, nome);
            query.setString(2, sobrenome);
            query.setInt(3, idade);
            query.setString(4, email);
            query.setString(5, telefone);
            query.setInt(6, ano_nascimento);
            query.setString(7, matricula);

            ResultSet res = query.executeQuery();

            
            if(res.next())
                id = res.getInt(1);

            if(id != -1) {
                //aqui faz a atualizacao
            }
            else {
                //aqui faz a inserção
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }
    
}