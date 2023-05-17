package grafo;
import RedeSocial.Pessoa;

public class ListaAdj<T>{
  private Vertice<T> inicio;
  private Vertice<T> fim;
  private Vertice<T> abaixo;

  public ListaAdj(Vertice<T> v){
  inicio = fim = v;
  }
    
  
  public void setAbaixo(Vertice<T> a){ abaixo = a; }
  public Vertice<T> getAbaixo(){ return abaixo; }
  public void append(Vertice<T> obj){
    setAbaixo(obj);
    fim = obj;
  }

  public void printData(T obj){ obj.imprimirDados(); }

  public void printRel(Vertice<T> obj){ obj.imprimirRelacoes(); }

  public void printGraph(){
    Vertice<T> aux = inicio;
    for(; aux==null; aux = getAbaixo()){
      aux.imprimirRelacoes();
      System.out.printf("||\n\\//\n");
    }
    System.out.printf("||\n\\//\nS\nS\n");
  }
} 