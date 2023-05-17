package grafo;
import RedeSocial.Pessoa;

public class Vertice<T>{
  private T obj;
  private Vertice<T> prox;
  

  public Vertice(T obj){
    this.obj = obj; 
    prox = null;
  }

  public void setProx(Vertice<T> c){ prox = c; }
  public Vertice<T> getProx(){ return prox; }
  public T getObjProx() { return prox.obj; }

  public void addRel(Vertice<T> obj) { //PERG RENE SOBRE ISSO
    Vertice<T> P = getProx();
    if(P!=null){
      while(P.getProx()!=null) P = P.getProx();
      if(P.getProx()==null) P.setProx(obj);  
    }
    if(getProx()==null) setProx(obj);
  }

  public void imprimirRelacoes(){
    T P = obj;
    for(int i=0; getProx()==null; i++){
      System.out.printf(P.getNome(), " ->");
      P = getObjProx();
    }
    System.out.printf("-~~\n");
  }
}
