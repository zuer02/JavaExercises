package Lista;

public class No{
  private int valor;
  private No proximo;
  
  public No(){ this(0);}
  
  public No(int valor){
    this.valor = valor;
    proximo = null;
  }
  public void alteravalor(int valor){ this.valor = valor; }
  
  public void setProximo(No no){ proximo = no; }
  public No getProximo(){ return proximo; }
  public int getValor(){ return valor; }
}
