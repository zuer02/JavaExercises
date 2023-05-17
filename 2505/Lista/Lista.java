// "new" em java == malloc ;;;;;;;;; adicionar em qualquer posicao  E  retornar elemento em tal posicao E imprimir lista toda ; o de retornar em qq posicao é mais facil que o adicionar em qq posicao
package Lista;

public class Lista{
  private No inicio;
  private No fim;
  private int tamanho;
  public Lista(){
    inicio = fim = null;
    tamanho = 0;
  }
  public Lista(int valor){
    inicio = fim = new No(valor);
    tamanho = 1;
  }
  public void addFim(int valor){
    No temp = new No(valor);
    if(inicio == null)
        inicio = fim = temp;
    else {
        fim.setProximo(temp);
        fim = temp;
    }
    ++tamanho;
  }

  public int getTamanho(){ return tamanho; }
  public No getInicio(){ return inicio; }
  
  public void oqposicao(int pos){
    No N;
    N = getInicio();
    for(int i=1;i<=getTamanho(); i++){
      if(i==pos) System.out.println(N.getValor());
      else N = N.getProximo();
    }
    if(pos>getTamanho()) System.out.println("posicao inexistente");
  }

  public void addposicao(int valor, int posicao){
    No novo = new No(valor);
    No N;
    No aux;
    N = getInicio();
    for(int i=0;i<getTamanho(); i++){
      if(i==(posicao-2)){
        aux = N.getProximo();
        N.setProximo(novo);
        novo.setProximo(aux);
        break;
      }
      else N = N.getProximo();
    }
  }
  public void imprime(){
    No N;
    N = getInicio();
    System.out.println(N.getValor());
    for(int i=0;i<getTamanho()-1; i++){
      N = N.getProximo();
      System.out.println(N.getValor());
    }
  }

}