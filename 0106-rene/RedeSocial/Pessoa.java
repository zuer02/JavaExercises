package RedeSocial;

public class Pessoa{
  private String nome;
  private String datanasc;
  private String id;
  private int idade;

  public Pessoa(String nome, String datanasc, int idade, String id){
    this.nome = nome;
    this.datanasc = datanasc;
    this.idade = idade;
    this.id = id;
  }

  public String getNome(){ return nome; }
  public String getDatanasc(){ return datanasc; }
  public int getIdade(){ return idade; }
  public String getId(){ return id; }

  public void imprimirDados(){
    System.out.printf("Nome: %s\n", getNome());
    System.out.printf("Data de nascimento: %s\n", getDatanasc());
    System.out.printf("Idade: %d\n", getIdade());
    System.out.printf("RG: %s\n", getId());
  }
} 
