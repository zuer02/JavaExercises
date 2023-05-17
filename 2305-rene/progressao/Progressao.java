package progressao;

public class Progressao{
  protected int primeiro;
  protected int atual;

  public Progressao(){
    primeiro = 0;
    atual = 0;
  }

  public Progressao(int valor){
    primeiro = atual = valor;
  }

  public int primeiroValor(){
    atual = primeiro;
    return atual;
  }

  public int proximoValor(){ return ++atual; } // aqui incrementa e da o valor

  public void imprime(int n){
    System.out.print(primeiroValor());
    for(int i=1; i<n; i++) System.out.print(" " + proximoValor());
    System.out.println();
  }

}
  //primeiro valor e metodo q vai me dar o proximo valor

